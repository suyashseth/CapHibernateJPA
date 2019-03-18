package com.capgemini.dev.many_to_many;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Trainer {

	@Id
	private int tid;
	private String name;
	@ManyToMany(cascade=CascadeType.ALL)
	private Set<Student>student;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Student> getStudent() {
		return student;
	}
	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Trainer [tid=" + tid + ", name=" + name + ", student=" + student + "]";
	}
	
	
	
	
}
