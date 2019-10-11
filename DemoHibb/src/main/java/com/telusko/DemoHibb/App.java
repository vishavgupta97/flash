package com.telusko.DemoHibb;

import java.util.Random;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;

//import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien a = null;

    	
      Configuration config = new Configuration().configure() .addAnnotatedClass(Laptop.class);
	  SessionFactory sf = config.buildSessionFactory();
      Session session = sf.openSession();
      
      
      session.beginTransaction();
      
      Laptop l = new Laptop();
      l.setLid(52);
      l.setBrand("DELL");
      l.setPrice(800);
      
      session.save(l);
      l.setPrice(750);
      
    

      session.getTransaction().commit();
     


    }
}
