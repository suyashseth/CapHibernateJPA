package com.capgemini.dev.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestInsert {
public static void main(String[] args) {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
	EntityManager manager = factory.createEntityManager();
	manager.getTransaction().begin();
	
	Employee emp  = new Employee();
	emp.setEid(104);
	emp.setName("dinga");
	emp.setSalary(17200);
	
	manager.persist(emp);
	manager.getTransaction().commit();
	manager.close();
	}
}
