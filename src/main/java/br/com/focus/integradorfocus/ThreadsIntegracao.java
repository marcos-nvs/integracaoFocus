/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.integradorfocus;

import br.com.dasa.protocolo.ProtocoloDasa;
import br.com.focus.configuracao.ConfigClient;
//import br.com.focus.entities.AgendaexaMaster;
import br.com.focus.objetos.Laboratorio;
import br.com.focus.utils.VerificaConexaoRemoto;
import br.com.focus.view.TelaIntegracao;
import br.com.ln.hibernate.utils.SessionHelper;
//import br.com.ln.entities.AgendaExaMaster;
//import br.com.ln.entities.LabExa;
//import br.com.ln.utils.VerificaConexaoRemoto;
import java.net.MalformedURLException;
import javax.swing.JTextArea;
import javax.swing.JTextField;
//import java.util.List;

/**
 *
 * @author Marcos Naves
 */
public class ThreadsIntegracao extends Thread {

    String codLaboratorio;
    private final int minimumLoopTime;
    private int minimumLoopTimeBase;
    private final int maxmumLoopTime;

    public ThreadsIntegracao(ConfigClient configClient) {

        TelaIntegracao.configClient = configClient;
        this.codLaboratorio = configClient.getCodLaboratorio();
        this.maxmumLoopTime = configClient.getMaxmumLoopTime();
        this.minimumLoopTime = configClient.getMinimumLoopTime();
        this.minimumLoopTimeBase = configClient.getMinimumLoopTime();
    }

    @Override
    public void run() {

        try {
            while (true) {
                try {
                    if (VerificaConexaoRemoto.verificaWebServerRemoto("http://ciewebservice.dasa.com.br/wsintegra/LoteExamesXmlReceiver")) {
                        if (!codLaboratorio.equals("")) {

                            Laboratorio laboratorio = SessionHelper.getLaboratorio(new Integer(codLaboratorio));

                            if (laboratorio != null) {

                                if (laboratorio.getAtivo()) {
                                    TelaIntegracao.incluiMensagem("Laboratorio : " + laboratorio.getNome());
                                    
                                    if (laboratorio.getCodLab() == 10){
                                        ProtocoloDasa dasa = new ProtocoloDasa();
                                        dasa.realizaIntegracao(laboratorio);
                                    }
                                    TelaIntegracao.incluiMensagem("Sistema parado aguardando próximo ciclo");
                                    
                                    Thread.sleep(minimumLoopTime);
                                } else {
                                    TelaIntegracao.incluiMensagem("Laboratório não está ativo");
                                }
                            } else {
                                TelaIntegracao.incluiMensagem("Laboratorio nao encontrado !!!!");
                                Thread.sleep(minimumLoopTime);
                            }
                        } else {
                            TelaIntegracao.incluiMensagem("Laboratorio nao definido!!!!");
                            Thread.sleep(minimumLoopTime);
                        }
                    } else {
                        TelaIntegracao.incluiMensagem("Computador fora da internet ou servidor inacessível indo dormir por " + (minimumLoopTimeBase + minimumLoopTimeBase));
                        this.minimumLoopTimeBase = minimumLoopTimeBase + minimumLoopTimeBase;
                        Thread.sleep(minimumLoopTimeBase);
                    }
                } catch (MalformedURLException ex) {
                    this.minimumLoopTimeBase = 0;
                }
            }

        } catch (InterruptedException ex) {
            TelaIntegracao.incluiMensagem("Ocorreu um problema durante o processo !!");
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
