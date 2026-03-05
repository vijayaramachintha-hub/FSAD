package com.klu;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory factory;

    static {
        try {
            // Create SessionFactory from hibernate.cfg.xml
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();

            System.out.println("Hibernate SessionFactory Created");
        } catch (Exception e) {
            System.err.println("SessionFactory creation failed");
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}

