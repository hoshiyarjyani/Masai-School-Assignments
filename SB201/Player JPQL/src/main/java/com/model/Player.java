package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
//@NamedQuery(name = "Player.getNames",query = "Select p.Name from Player")
public class Player {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int Pid;
	String Name;
	String SportName;
	int Age;
	
	public Player() {
	}
	
	public Player(String name, int age, String sportName) {
		Name = name;
		SportName = sportName;
		Age = age;
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSportName() {
		return SportName;
	}

	public void setSportName(String sportName) {
		SportName = sportName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return "Player [Pid=" + Pid + ", Name=" + Name + ", SportName=" + SportName + ", Age=" + Age + "]";
	}
	
}
