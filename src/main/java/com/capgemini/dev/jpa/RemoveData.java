package com.capgemini.dev.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoveData {
public static void main(String[] args) {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPersistanceUnit");
	EntityManager manager = factory.createEntityManager();
	manager.getTransaction().begin();
	
	Employee emp = manager.find(Employee.class,103);
	manager.remove(emp);
	
	manager.getTransaction().commit();
	manager.close();
	factory.close();
	
}
}
