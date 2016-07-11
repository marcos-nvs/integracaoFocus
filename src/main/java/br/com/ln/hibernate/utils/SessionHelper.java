/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ln.hibernate.utils;

import br.com.focus.entities.Agendaexa;
import br.com.focus.entities.AgendaexaMaster;
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

    public static Date getDateDbSqlServer() {

        Session session = null;
        Transaction tx;

        Date dataDb = null;

        try {
            session = SessionFactoriByDBName.getCurrentSessionFacesFocus();
            tx = session.beginTransaction();

            Query query = session.createSQLQuery("select GETDATE()");
            List list = query.list();

            if (list != null && !list.isEmpty()) {
                dataDb = (Date) list.get(0);
            }
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return dataDb;
    }

    public static List<Object> getInformacaoLab(Integer codLab) {

        Session session = null;
        Transaction tx;
        List<Object> listObj = null;

        try {
            session = SessionFactoriByDBName.getCurrentSessionFacesFocus();
            tx = session.beginTransaction();

            Query query = session.createSQLQuery(StaticQuery.cientificalab);
            query.setInteger("codLab", codLab);

            listObj = query.list();
            tx.commit();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return listObj;
    }

    public static List<AgendaexaMaster> getAgendaExaMaster(Integer codPedido) {

        Session session = null;
        Transaction tx;
        List<AgendaexaMaster> listaAgendaMaster;

        try {
            session = SessionFactoriByDBName.getCurrentSessionFacesFocus();
            tx = session.beginTransaction();

            Query query = session.getNamedQuery("AgendaexaMaster.findByCodAgendaexaMaster");
            query.setInteger("codAgendaexaMaster", codPedido);

            listaAgendaMaster = query.list();
            tx.commit();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return listaAgendaMaster;
    }

    public static Agendaexa getAgendaExa(Integer pedido, Integer exame) {

        Session session = null;
        Transaction tx;
        Agendaexa agendaExa = null;

        try {
            session = SessionFactoriByDBName.getCurrentSessionFacesFocus();
            tx = session.beginTransaction();

            Query query = session.createSQLQuery("select * from agendaexa where cod_age_exa = :codAgeExa and cod_sub_exa = :codSubExa");
            query.setInteger("codAgeExa", pedido);
            query.setInteger("codSubExa", exame);

            List list = query.list();
            tx.commit();

            if (list != null && !list.isEmpty()) {
                agendaExa = (Agendaexa) list.get(0);
            }

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return agendaExa;
    }

    public static List<Agendaexa> getListAgendaExa(Integer pedido) {

        Session session = null;
        Transaction tx;
        List<Agendaexa> listaAgendaExa = null;

        try {
            session = SessionFactoriByDBName.getCurrentSessionFacesFocus();
            tx = session.beginTransaction();

            Query query = session.createSQLQuery("select * from agendaexa where cod_age_exa = :codAgeExa");
            query.setInteger("codAgeExa", pedido);

            listaAgendaExa = query.list();
            tx.commit();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return listaAgendaExa;
    }

    public static void saveOrUpdateObject(Object obj) {
        Session session = null;
        Transaction tx;
        try {
            session = SessionFactoriByDBName.getCurrentSessionFacesFocus();
            tx = session.beginTransaction();
            session.saveOrUpdate(obj);
            tx.commit();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

    }

    public static void saveObject(Object obj) {
        Session session = null;
        try {
            session = SessionFactoriByDBName.getCurrentSessionFacesFocus();
            Transaction tx = session.beginTransaction();
            session.save(obj);
            tx.commit();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
