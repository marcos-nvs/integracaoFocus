/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ln.hibernate.utils;

import java.io.Serializable;
import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Marcos Naves
 */
public class SessionFactoriByDBName implements Serializable {

    public static Session getCurrentSession4FacesFocus() {
        SessionFactory factory = getSessionFactoryFocus();
        return factory.openSession();
    }

    public Session getCurrentSession4FacesByDbName2() {
        SessionFactory factory = getSessionFactoryFocus();
        return factory.openSession();
    }

    private static SessionFactory getSessionFactoryFocus() {
        SessionFactory sessionFactory = buildSessionFactoryFocus();
        return sessionFactory;
    }

    private static SessionFactory buildSessionFactoryFocus() {

        SessionFactory sessionFactory = null;
        try {
            sessionFactory = new AnnotationConfiguration().configure("hibernate.cfg.xml").buildSessionFactory();
            return sessionFactory;
        } catch (HibernateException xcp) {
            System.out.println(xcp.getMessage());
        }
        return sessionFactory;
    }
}
