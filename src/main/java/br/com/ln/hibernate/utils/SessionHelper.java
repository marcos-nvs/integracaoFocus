/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ln.hibernate.utils;

import br.com.focus.objetos.Laboratorio;
import java.text.SimpleDateFormat;
import java.util.Date;
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

    public static Laboratorio getLaboratorio(Integer codLaboratorio) {

        Session session = null;
        Transaction tx;
        Laboratorio laboratorio = null;

        try {
            session = SessionFactoriByDBName.getCurrentSessionFacesFocus();
            tx = session.beginTransaction();

            Query query = session.createSQLQuery("select COD_LAB, NOME, ATIVO from LABEXA where cod_lab = :codLab");
            query.setInteger("codLab", codLaboratorio);

            List list = query.list();
            tx.commit();

            if (list != null && !list.isEmpty()) {

                for (Object obj : list) {
                    Object[] tupla = (Object[]) obj;
                    
                    laboratorio = new Laboratorio();

                    laboratorio.setCodLab((Integer) tupla[0]);
                    laboratorio.setNome((String) tupla[1]);
                    laboratorio.setAtivo((Boolean) tupla[2]);
                }
            }

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return laboratorio;
    }
    
    public static Date getDateDbSqlServer(){
        
        Session session = null;
        Transaction tx;
        
        Date dataDb = null;
        
        try{
            session = SessionFactoriByDBName.getCurrentSessionFacesFocus();
            tx =session.beginTransaction();
            
            Query query = session.createSQLQuery("select GETDATE()");
            List list = query.list();
            
            if (list != null && !list.isEmpty()){
                dataDb = (Date) list.get(0);
            }
        }finally{
            if (session != null && session.isOpen()){
                session.close();
            }
        }
        return dataDb;
    }
}
