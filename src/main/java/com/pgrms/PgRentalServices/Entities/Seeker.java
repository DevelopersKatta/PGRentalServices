package com.pgrms.PgRentalServices.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seeker {
	private int seekerId;
	private String seekerName;
	private long seekerMobile;
	private String seekerEmail;
	private String seekerAddress;
	private String seekerCity;
	private String seekerRole;
	private String seekerPassword;
	private String seekerPhoto;

	public Seeker() {
	}

	public Seeker(int seekerId, String seekerName, long seekerMobile, String seekerEmail, String seekerAddress,
			String seekerCity, String seekerRole, String seekerPassword, String seekerPhoto) {
		super();
		this.seekerId = seekerId;
		this.seekerName = seekerName;
		this.seekerMobile = seekerMobile;
		this.seekerEmail = seekerEmail;
		this.seekerAddress = seekerAddress;
		this.seekerCity = seekerCity;
		this.seekerRole = seekerRole;
		this.seekerPassword = seekerPassword;
		this.seekerPhoto = seekerPhoto;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getSeekerId() {
		return seekerId;
	}

	public void setSeekerId(int seekerId) {
		this.seekerId = seekerId;
	}

	public String getSeekerName() {
		return seekerName;
	}

	public void setSeekerName(String seekerName) {
		this.seekerName = seekerName;
	}

	public long getSeekerMobile() {
		return seekerMobile;
	}

	public void setSeekerMobile(long seekerMobile) {
		this.seekerMobile = seekerMobile;
	}

	public String getSeekerEmail() {
		return seekerEmail;
	}

	public void setSeekerEmail(String seekerEmail) {
		this.seekerEmail = seekerEmail;
	}

	public String getSeekerAddress() {
		return seekerAddress;
	}

	public void setSeekerAddress(String seekerAddress) {
		this.seekerAddress = seekerAddress;
	}

	public String getSeekerCity() {
		return seekerCity;
	}

	public void setSeekerCity(String seekerCity) {
		this.seekerCity = seekerCity;
	}

	public String getSeekerRole() {
		return seekerRole;
	}

	public void setSeekerRole(String seekerRole) {
		this.seekerRole = seekerRole;
	}

	public String getSeekerPassword() {
		return seekerPassword;
	}

	public void setSeekerPassword(String seekerPassword) {
		this.seekerPassword = seekerPassword;
	}

	public String getSeekerPhoto() {
		return seekerPhoto;
	}

	public void setSeekerPhoto(String seekerPhoto) {
		this.seekerPhoto = seekerPhoto;
	}

}

