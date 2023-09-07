package hbpojo;

//package com.common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public final class HibernateConfig {
    public static SessionFactory getSessionFactory() {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(student.class);
        SessionFactory sf = cfg.buildSessionFactory();
        return sf;

    }




}
