package com.capgemini.dev.many_to_many;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Student {

	@Id
	private int sid;
	private String sname;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(joinColumns=@JoinColumn(name="sid"),
	inverseJoinColumns=@JoinColumn(name="tid"))
	private Set<Trainer>trainer;
	public int getId() {
		return sid;
	}
	public void setId(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return sname;
	}
	public void setName(String sname) {
		this.sname = sname;
	}
	public Set<Trainer> getTrainer() {
		return trainer;
	}
	public void setTrainer(Set<Trainer> trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "Student [id=" + sid + ", name=" + sname + ", trainer=" + trainer + "]";
	}
	
	
	
}
