/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.view;

import br.com.focus.configuracao.ConfigClient;
import br.com.focus.configuracao.CriaArquivo;
import br.com.ln.hibernate.utils.SessionHelper;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author Marcos Naves
 */

public class TelaIntegracao {
    
    public static JTextArea taMensagem;
    public static JTextField edtExame;
    public static JTextField edtPaciente;
    public static ConfigClient configClient;

    
    public static JTextArea incluiMensagem(String mensagem){
        
        if (mensagem != null){
            taMensagem.append(SessionHelper.getDateDbSqlServer() + " - " + mensagem + "\n");
        }
        
        if (taMensagem.getLineCount() >= 50) {
            CriaArquivo.gravaLog();
            taMensagem.setText("");
        }
        
        return taMensagem;
    }
    
}
