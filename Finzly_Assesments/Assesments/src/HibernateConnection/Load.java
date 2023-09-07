package hbpojo;

//package com.demo1.client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import hbpojo.student;
//import com.common.HibernateConfig;
//import com.demo1.pojo.Employee;

public class Load {

    public static void main(String[] args) {
        SessionFactory sf= HibernateConfig.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        student e = session.load(student.class, 101);
        System.out.println(e);
        tr.commit();
        session.close();

    }

}
