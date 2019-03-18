package com.capgemini.dev.one_to_many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestOneToMany {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
	EntityManager manager = emf.createEntityManager();
	manager.getTransaction().begin();
	
	Account a1 = new Account();
	a1.setAccnumber(123);
	a1.setBankname("ICICI Bank");
	a1.setIfsc("ifsc");
	
	Account a2 = new Account(); 
	a2.setAccnumber(9871);
	a2.setBankname("SBI");
	a2.setIfsc("sbiifsc");
	
	List<Account> list = new ArrayList<Account>();
	list.add(a1);
	list.add(a2);
	
	Person p = new Person();
	p.setName("Batman");
	p.setPhoneNumber(3434); 
	p.setList(list);
	
	manager.persist(p);
    manager.getTransaction().commit();
    manager.close();
    emf.close();
    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
