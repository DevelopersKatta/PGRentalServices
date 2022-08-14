package com.pgrms.PgRentalServices.Entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Products {
//	@GeneratedValue
	@Id
	private int id;
	private String name;
//	@Column
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	private Byte[] image;
	
	public Products(int id, String name, Byte[] image) {
	this.id = id;
	this.name = name;
	this.image = image;
	
	
	
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



	public Byte[] getImage() {
		return image;
	}



	public void setImage(Byte[] image) {
		this.image = image;
	}


	

	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", image=" + Arrays.toString(image) + "]";
	}



	public Products() {

	}


	
}
