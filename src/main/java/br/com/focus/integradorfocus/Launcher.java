/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.focus.integradorfocus;

import br.com.focus.configuracao.ConfigClient;
import br.com.focus.configuracao.CriaArquivo;
import br.com.focus.utils.SimpleDateFormatsSamples;
import br.com.ln.hibernate.utils.SessionHelper;
//import br.com.ln.entities.LabExa;
//import br.com.ln.utils.SimpleDateFormatsSamples;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Marcos Naves
 */
public class Launcher {
    
    static File fileLog = null;
    static String strfileName = null;
    static Writer output;

    public static void main(String[] arg) throws IOException{
    
        ConfigClient configCliente = CriaArquivo.ConstroiArquivoXML();

        if (configCliente != null){
            logOneMoreLine(3, "Sistema configurado com sucesso!");
            Session session;

            try {
                session = SessionHelper.getSessionDude(configCliente.getStrDbName());
                Transaction tx = session.beginTransaction();

                Query lista = session.getNamedQuery("LabExa.findCodLab");
                lista.setInteger("codLab", 10);

                List listaLab = lista.list();
                tx.commit();

                if (listaLab != null) {
                    for (Object object : listaLab) {
//                        LabExa laboratorio;
//                        laboratorio = (LabExa) object;
//
//                        new ThreadsIntegracao(laboratorio, configCliente);
                    }
                }
            } catch (HibernateException xcp) {
                logOneMoreLine(3, "Ocorreu um erro no banco de dados: " + xcp.getMessage());
            }
        }
    }
    
    public static void logOneMoreLine(int status, String msg){
        
        String strStatus;
        
        switch (status){
            case 0:
                strStatus = "FATAL: ";
                break;
            case 1:
                strStatus = "SERVERE: ";
                break;
            case 2:
                strStatus = "WARNING: ";
                break;
            case 3:
                strStatus = "INFO: ";
                break;
            default:
                strStatus = "Fora do status.";
                break;
        }
        
        try{
            if (strfileName == null || fileLog == null){
                strfileName = "logs/" + SimpleDateFormatsSamples.formateYearMonthDayHH.format(new Date()) + ".logs";
                fileLog = new File(strfileName);
                output = new BufferedWriter(new FileWriter(fileLog, true));
                
            } else if (!strfileName.equalsIgnoreCase("logs/" + SimpleDateFormatsSamples.formateYearMonthDayHH.format(new Date()) + ".log")) {
                strfileName = "logs/" + SimpleDateFormatsSamples.formateYearMonthDayHH.format(new Date()) + ".log";
                fileLog = new File(strfileName);
                if (output != null){
                    output.close();
                }
                output = new BufferedWriter(new FileWriter(fileLog, true));
            }
            output.append(strStatus + SimpleDateFormatsSamples.formaterHourMinuteDots.format(new Date()) + "=> " + msg + "\n"); 
            output.flush();
        }catch (IOException ex){
            Logger.getLogger(Launcher.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
