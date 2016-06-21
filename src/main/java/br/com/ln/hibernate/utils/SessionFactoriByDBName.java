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
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author Marcos Naves
 */

public class SessionFactoriByDBName implements Serializable {

    static Map<String, SessionFactory> map4SessionFactory = new HashMap<>();
    
    public static Session getCurrentSession4FacesByDbName(String strDbName) {
        SessionFactory factory = getSessionFactoryByDbName(strDbName);
        return factory.openSession();
    }

    public Session getCurrentSession4FacesByDbName2(String strDbName) {
        SessionFactory factory = getSessionFactoryByDbName(strDbName);
        return factory.openSession();
    }

    private static SessionFactory getSessionFactoryByDbName(String strDBName) {
        strDBName = strDBName.toUpperCase();
        if (map4SessionFactory.containsKey(strDBName)) {
            return map4SessionFactory.get(strDBName);
        } else {
            SessionFactory sessionFactory = buildSessionFactoryByDBName(strDBName);
            map4SessionFactory.put(strDBName, sessionFactory);
            return sessionFactory;
        }
    }

    private static SessionFactory buildSessionFactoryByDBName(String strDBName) {

        SessionFactory sessionFactory = null;
        try {
            System.out.println("Getting Session from client :  " + strDBName);
            System.out.println("Getting Session from client :  " + "hibernate" + strDBName.toUpperCase() + ".cfg.xml");
            sessionFactory = new AnnotationConfiguration().configure("hibernate" + strDBName.toUpperCase() + ".cfg.xml").buildSessionFactory();
            return sessionFactory;
        } catch (HibernateException xcp) {
            System.out.println(xcp.getMessage());
        }
        return sessionFactory;
    }
}
