package com.capgemini.dev.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CustomQuery {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = new Persistence().createEntityManagerFactory("myPersistanceUnit");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
	    Query query = manager.createNamedQuery("named query");
	    query.setParameter("id",103);
	    
	    List<Employee>emp = query.getResultList();
	    for(Employee e:emp)
	    {
	    	System.out.println(e.getName());
	    	System.out.println(e.getSalary());
	    }
	    
	    manager.getTransaction().commit();
	    manager.close();
	    factory.close();
	    
		
		
		
		
		
		
		
		
	}
}
