package com.interview;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "studenttbl")
public class Student 
{

	@Id
	int sId;
	String name;
	String lastname;
	
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Student(int sId, String name, String lastname) 
	{
		super();
		this.sId = sId;
		this.name = name;
		this.lastname = lastname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
