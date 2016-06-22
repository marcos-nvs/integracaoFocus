/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ln.hibernate.utils;

import br.com.focus.entities.Labexa;
import java.text.SimpleDateFormat;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Marcos Naves
 */

public class SessionHelper {

    public static SimpleDateFormat formatOnlyYear = new SimpleDateFormat("yyyy");
    
    public static Session getSessionDude(String strDbName) {
        Session session = null;
        Transaction tx = null;

        if (session == null || !session.isOpen()) {
            return SessionFactoriByDBName.getCurrentSession4FacesByDbName(strDbName);
        } else {
            return session;
        }
    }
    

    public static Labexa getLaboratorio(String codLaboratorio) {
        
        Session session = null;
        Transaction tx;
        Labexa labExa = null;
        
        try{
            
        }finally{
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return labExa;
    }

}