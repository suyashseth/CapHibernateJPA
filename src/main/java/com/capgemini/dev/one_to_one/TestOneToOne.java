package com.capgemini.dev.one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOneToOne {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = emf.createEntityManager();
		manager.getTransaction().begin();
		
		User us = new User();
		us.setAge(20);
		us.setUname("Neha");
		
		Passport p = new Passport();
		p.setPcountry("India");
		p.setUs(us);
		
		manager.persist(p);
		manager.getTransaction().commit();
		manager.close();
		emf.close();
		
		
		
		
		
		
		
		
		
	}
}
