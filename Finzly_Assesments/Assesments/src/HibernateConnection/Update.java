package hbpojo;

//package com.demo1.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

//import com.common.HibernateConfig;
//import com.demo1.pojo.Employee;

public class Update {

    public static void main(String[] args) {
        SessionFactory sf= HibernateConfig.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        student emp=new student();
        emp.setid(102);
        emp.setname("Sakthi");
        emp.setage("21");
//        emp.setRole("dev");
        session.update(emp);
        System.out.println("Data updated successfully");
        tr.commit();
        session.close();
    }

}
