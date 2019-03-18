package com.capgemini.dev.one_to_many;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Person {

	@Id
	@Column
	private int phoneNumber;
	@Column
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="phoneNumber")
	private List<Account>list;
	
	public List<Account> getList() {
		return list;
	}
	public void setList(List<Account> list) {
		this.list = list;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [phoneNumber=" + phoneNumber + ", name=" + name +" ]";
	}
	
	
}
