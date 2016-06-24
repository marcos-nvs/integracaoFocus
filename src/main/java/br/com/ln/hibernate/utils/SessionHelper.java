/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ln.hibernate.utils;

import br.com.focus.entities.AgendaexaMaster;
import br.com.focus.entities.Labexa;
import java.text.SimpleDateFormat;
import java.util.List;
import org.hibernate.Query;
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
            return SessionFactoriByDBName.getCurrentSession4FacesFocus();
        } else {
            return session;
        }
    }
    

    public static Labexa getLaboratorio(Integer codLaboratorio) {
        
        Session session = null;
        Transaction tx;
        Labexa labExa = null;
        
        try{
            session = SessionFactoriByDBName.getCurrentSession4FacesFocus();
            tx = session.beginTransaction();
            
            Query query = session.getNamedQuery("Labexa.findByCodLab");
            query.setInteger("codLab", codLaboratorio);
            
            List list = query.list();
            tx.commit();
            
            if (list != null && !list.isEmpty()){
                labExa = (Labexa) list.get(0);
            }
            
        }finally{
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return labExa;
    }
    
    public AgendaexaMaster getSolicitacao(String codLaboratorio){
        
        Session session = null;
        Transaction tx;
        AgendaexaMaster agendaexaMaster = null;
        
        try{
            session = SessionFactoriByDBName.getCurrentSession4FacesFocus();
            tx = session.beginTransaction();
            
            Query query = session.getNamedQuery(codLaboratorio);
            
        }finally{
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        
        return agendaexaMaster;
        
    }

}