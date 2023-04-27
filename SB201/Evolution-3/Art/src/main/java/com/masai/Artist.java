package com.masai;

public class Artist {
	private int id;
	private String name;
	private int age;
	private int noOfArtworksCreated;
	private String email;
	private String mobile;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNoOfArtworksCreated() {
		return noOfArtworksCreated;
	}
	public void setNoOfArtworksCreated(int noOfArtworksCreated) {
		this.noOfArtworksCreated = noOfArtworksCreated;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Artist [id=" + id + ", name=" + name + ", age=" + age + ", noOfArtworksCreated=" + noOfArtworksCreated
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}

}
