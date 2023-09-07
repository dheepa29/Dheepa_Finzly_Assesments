package hbpojo;

//package com.demo1.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

//import com.common.HibernateConfig;
//import com.demo1.pojo.Employee;

public class Save {
    public static void main(String[] args) {
        SessionFactory sf= HibernateConfig.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        student emp=new student();
        emp.setid(107);
        emp.setname("keerthi");
        emp.setage("21");
//        emp.setage("12");
        session.save(emp);
        System.out.println("Data saved successfully");
        tr.commit();
        session.close();
    }

}
