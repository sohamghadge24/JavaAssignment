package com.labAssignment.Operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Insertting Data
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int i=1;
        // Get session factory using Hibernate Util class
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        // Get session from Sesson factory
        System.out.println(sf);
        Session session = sf.openSession();
      
     
        // Begin transaction
        Transaction t = session.beginTransaction();
       
        if(i==1){//insert
          Student applicant1 = new Student();
          applicant1.setMarks(1);
          applicant1.setName("John");
          applicant1.setMarks(90);
          applicant1.setRemark("Graduation");

          Student applicant2 = new Student();
          applicant2.setMarks(2);
          applicant2.setName("Jacob");
          applicant2.setMarks(70);
          applicant2.setRemark("Graduation");


          session.save(applicant1);
          session.save(applicant2);

          // Commit the transaction and close the session
          t.commit();
          session.close();
          System.out.println("successfully persisted Applicant details");
        }
      if(i==2){
        //update
       
        Query query = session.createQuery("update Applicant set mark=:mark where SId=:SId");
        query.setParameter("age", 30);
        query.setParameter("id", 1);
        // Begin transaction
        Transaction t = session.beginTransaction();
        int result = query.executeUpdate();
        // Commit the transaction and close the session
        t.commit();
        System.out.println("No of rows updated: "+result);
      }
      
      
}

