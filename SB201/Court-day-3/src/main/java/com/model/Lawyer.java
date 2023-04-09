package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lawyer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String email;
	String address;
	int experience;

	public Lawyer() {
	}
	
	
	public Lawyer(String name, String email, String address, int experience) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.experience = experience;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	@Override
	public String toString() {
		return "Lawyer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", experience="
				+ experience + "]";
	}

	


}
