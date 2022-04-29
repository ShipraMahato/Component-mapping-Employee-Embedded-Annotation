package com.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainClass {

	public static void main(String[] args) {

		Configuration con= new Configuration().configure().addAnnotatedClass(Employee.class);
		 ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		 SessionFactory factory= con.buildSessionFactory(reg);
		 Session session= factory.openSession();
		 Transaction t= session.beginTransaction();
		 
		
		
		 Address ad=new Address("Bokaro", "Jharkhand",827013 );
		 
		 Employee em=new Employee(5, "Rani",ad);
		 session.save(em);
		 t.commit();
		 session.close();
	}

}