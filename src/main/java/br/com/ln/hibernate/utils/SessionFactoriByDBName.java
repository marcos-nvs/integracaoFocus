/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ln.hibernate.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author Marcos Naves
 */
public class SessionFactoriByDBName implements Serializable {

    static SessionFactory sessionFactory;

    public static Session getCurrentSessionFacesFocus() {

        if (sessionFactory != null) {
            return sessionFactory.openSession();
        } else {
            sessionFactory = getSessionFactoryFocus();
            return sessionFactory.openSession();
        }
    }

//    public Session getCurrentSession4FacesByDbName2() {
//        SessionFactory factory = getSessionFactoryFocus();
//        return factory.openSession();
//    }

    private static SessionFactory getSessionFactoryFocus() {
        SessionFactory sessionFactory = buildSessionFactoryFocus();
        return sessionFactory;
    }

    private static SessionFactory buildSessionFactoryFocus() {

        SessionFactory sessionFactory = null;
        try {
            Configuration cfg = new Configuration().configure();
            cfg.configure("hibernate.cfg.xml");
            StandardServiceRegistry seviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
            sessionFactory = cfg.buildSessionFactory(seviceRegistry);
        } catch (HibernateException ex) {
            ex.printStackTrace();
            System.out.println("Erro HibernateException ====>>> " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Erro Exception ====>>> " + ex.getMessage());
            ex.printStackTrace();
        }

        return sessionFactory;
    }
}
