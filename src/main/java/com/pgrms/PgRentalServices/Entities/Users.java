package com.pgrms.PgRentalServices.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
	private int userId;
	private String userName;
	private long userMobile;
	private String userEmail;
	private String usersAddress;
	private String userCity;
	private String userRole;
	private String userPassword;

	public Users() {

	}

	
	public Users(int userId, String userName, long userMobile, String userEmail, String usersAddress, String userCity,
			String userRole, String userPassword) {
		this.userId = userId;
		this.userName = userName;
		this.userMobile = userMobile;
		this.userEmail = userEmail;
		this.usersAddress = usersAddress;
		this.userCity = userCity;
		this.userRole = userRole;
		this.userPassword = userPassword;
	}




	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(long userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUsersAddress() {
		return usersAddress;
	}

	public void setUsersAddress(String usersAddress) {
		this.usersAddress = usersAddress;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}
