package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BikeOwner {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ownerId;
	private String ownerName;
	private String phoneNumber;
	private String emailId;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "bikeOwner")
	@JoinColumn(name = "bikeNo")
	private Bike bike;

	public BikeOwner() {
	}

	public BikeOwner( String ownerName, String phoneNumber, String emailId, Bike bike) {
	
		this.ownerName = ownerName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.bike = bike;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "BikeOwner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", phoneNumber=" + phoneNumber
				+ ", emailId=" + emailId + ", bike=" + bike + "]";
	}

}
