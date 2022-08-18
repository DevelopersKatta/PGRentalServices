package com.pgrms.PgRentalServices.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Owner {
	private int ownerId;
	private String ownerName;
	private long ownerMobile;
	private String ownerEmail;
	private String ownerAddress;
	private String ownerCity;
	private String ownerRole;
	private String ownerPassword;
	private String ownerPhoto;

	public Owner() {
	}

	public Owner(int ownerId, String ownerName, long ownerMobile, String ownerEmail, String ownerAddress,
			String ownerCity, String ownerRole, String ownerPassword, String ownerPhoto) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.ownerMobile = ownerMobile;
		this.ownerEmail = ownerEmail;
		this.ownerAddress = ownerAddress;
		this.ownerCity = ownerCity;
		this.ownerRole = ownerRole;
		this.ownerPassword = ownerPassword;
		this.ownerPhoto = ownerPhoto;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public long getOwnerMobile() {
		return ownerMobile;
	}

	public void setOwnerMobile(long ownerMobile) {
		this.ownerMobile = ownerMobile;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getOwnerAddress() {
		return ownerAddress;
	}

	public void setOwnerAddress(String ownerAddress) {
		this.ownerAddress = ownerAddress;
	}

	public String getOwnerCity() {
		return ownerCity;
	}

	public void setOwnerCity(String ownerCity) {
		this.ownerCity = ownerCity;
	}

	public String getOwnerRole() {
		return ownerRole;
	}

	public void setOwnerRole(String ownerRole) {
		this.ownerRole = ownerRole;
	}

	public String getOwnerPassword() {
		return ownerPassword;
	}

	public void setOwnerPassword(String ownerPassword) {
		this.ownerPassword = ownerPassword;
	}

	public String getOwnerPhoto() {
		return ownerPhoto;
	}

	public void setOwnerPhoto(String ownerPhoto) {
		this.ownerPhoto = ownerPhoto;
	}

}
