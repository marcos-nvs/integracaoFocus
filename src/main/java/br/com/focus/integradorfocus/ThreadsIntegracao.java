/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.integradorfocus;

import br.com.focus.configuracao.ConfigClient;
//import br.com.focus.entities.AgendaexaMaster;
import br.com.focus.entities.Labexa;
import br.com.focus.utils.VerificaConexaoRemoto;
import br.com.ln.hibernate.utils.SessionHelper;
//import br.com.ln.entities.AgendaExaMaster;
//import br.com.ln.entities.LabExa;
//import br.com.ln.utils.VerificaConexaoRemoto;
import java.net.MalformedURLException;
import javax.swing.JTextArea;
//import java.util.List;

/**
 *
 * @author Marcos Naves
 */
public class ThreadsIntegracao extends Thread {

    ConfigClient configClient;
    String codLaboratorio;
    private final int minimumLoopTime;
    private int minimumLoopTimeBase;
    private final int maxmumLoopTime;
    JTextArea taMensagem;

    public ThreadsIntegracao(JTextArea taMensagem, ConfigClient configClient) {

        this.configClient = configClient;
        this.codLaboratorio = configClient.getCodLaboratorio();
        this.maxmumLoopTime = configClient.getMaxmumLoopTime();
        this.minimumLoopTime = configClient.getMinimumLoopTime();
        this.minimumLoopTimeBase = configClient.getMinimumLoopTime();
        this.taMensagem = taMensagem;
    }

    @Override
    public void run() {

        try {
            while (true) {
                try {
                    if (VerificaConexaoRemoto.verificaWebServerRemoto("http://ciewebservice.dasa.com.br/wsintegra/LoteExamesXmlReceiver")) {

                        if (!codLaboratorio.equals("")) {
                            Labexa laboratorio = SessionHelper.getLaboratorio(new Integer(codLaboratorio));
                            
                            System.out.println("labexa - " + laboratorio.toString());

                            if (laboratorio != null) {
                                System.out.println("Laboratorio : " + laboratorio.toString());
                                taMensagem.append("Laboratorio : " + laboratorio.getNome());
                                Thread.sleep(minimumLoopTime);
                            } else {
                                System.out.println("Laboratorio nao encontrado !!!!");
                                Thread.sleep(minimumLoopTime);
                            }
                        } else {
                            System.out.println("Laboratorio nao definido!!!!");;
                            Thread.sleep(minimumLoopTime);
                        }
                    } else {
                        this.forcaSistemaDormir(1, "Computador fora da internet ou servidor inacessível indo dormir por " + (minimumLoopTimeBase + minimumLoopTimeBase));
                    }
                } catch (MalformedURLException ex) {
                    this.minimumLoopTimeBase = 0;
//                    Launcher.logOneMoreLine(1, ex.getMessage());
                    Thread.sleep(minimumLoopTime);
                }
            }

        } catch (InterruptedException ex) {
//            Launcher.logOneMoreLine(0, ex.getMessage() + "\\n Sistema interrompido");
        }
    }

    private void forcaSistemaDormir(int status, String msg) throws InterruptedException {

//        Launcher.logOneMoreLine(1, msg);
        if (this.minimumLoopTimeBase > this.maxmumLoopTime) {
            this.minimumLoopTimeBase = 0;
        }

        Thread.sleep(this.minimumLoopTimeBase + this.minimumLoopTimeBase);
        this.minimumLoopTimeBase += this.minimumLoopTime;
    }
}
