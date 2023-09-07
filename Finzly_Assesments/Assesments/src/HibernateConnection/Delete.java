package hbpojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Delete {

    public static void main(String[] args) {
        SessionFactory sf= HibernateConfig.getSessionFactory();
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        student emp=new student();
        emp.setid(107);
        session.delete(emp);
        System.out.println("Data deleted successfully");
        tr.commit();
        session.close();
    }

}
