package com.capgemini.dev.one_to_one;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Passport {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	private String pcountry;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="uid")
	private User us;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPcountry() {
		return pcountry;
	}
	public void setPcountry(String pcountry) {
		this.pcountry = pcountry;
	}
	public User getUs() {
		return us;
	}
	public void setUs(User us) {
		this.us = us;
	}
	@Override
	public String toString() {
		return "Passport [pid=" + pid + ", pcountry=" + pcountry + ", us=" + us + "]";
	}
	
	
	
}
