package com.capgemini.dev.many_to_many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestManyToMany {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistanceUnit");
	EntityManager manager = emf.createEntityManager();
	manager.getTransaction().begin();
	
	Student s1 = new Student();
	s1.setId(101);
	s1.setName("Aditya");
	
	Student s2 = new Student();
	s2.setId(102);
	s2.setName("Baba");
	
	Set<Student>student  = new HashSet<Student>();
	student.add(s1);
	student.add(s2);
	
	Trainer t1 = new Trainer();
	t1.setTid(1);
	t1.setName("Aatish");
	
	Trainer t2 = new Trainer();
	t2.setTid(2);
	t2.setName("Suyash");
	
	Set<Trainer>trainer = new HashSet<Trainer>();
	trainer.add(t1);
	trainer.add(t2);
	
	s1.setTrainer(trainer);
	s2.setTrainer(trainer);
	 
    t1.setStudent(student);
    t2.setStudent(student);

    manager.persist(t1);
    manager.persist(t2);
    
    manager.getTransaction().commit();
    manager.close();
    emf.close();
    
    
    
    
    
    
    
    
    
    
	
	
	
	
	
	
			
	
	
	
	
	
	
	
	
	
	
}
}
