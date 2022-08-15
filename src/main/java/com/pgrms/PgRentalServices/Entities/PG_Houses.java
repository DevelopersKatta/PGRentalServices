package com.pgrms.PgRentalServices.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PG_Houses {

	private int pg_id;
	private String pg_name;
	private String pg_address;
	private String pg_city;
	private String pg_description;
	private String pg_house_type;
	private String pg_status;
	private int pg_rent_price;
	private String pg_photo;

	public PG_Houses() {
	}

	public PG_Houses(int pg_id, String pg_name, String pg_address, String pg_city, String pg_description,
			String pg_house_type, String pg_status, int pg_rent_price, String pg_photo) {
		super();
		this.pg_id = pg_id;
		this.pg_name = pg_name;
		this.pg_address = pg_address;
		this.pg_city = pg_city;
		this.pg_description = pg_description;
		this.pg_house_type = pg_house_type;
		this.pg_status = pg_status;
		this.pg_rent_price = pg_rent_price;
		this.pg_photo = pg_photo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getPg_id() {
		return pg_id;
	}

	public void setPg_id(int pg_id) {
		this.pg_id = pg_id;
	}

	public String getPg_name() {
		return pg_name;
	}

	public void setPg_name(String pg_name) {
		this.pg_name = pg_name;
	}

	public String getPg_address() {
		return pg_address;
	}

	public void setPg_address(String pg_address) {
		this.pg_address = pg_address;
	}

	public String getPg_city() {
		return pg_city;
	}

	public void setPg_city(String pg_city) {
		this.pg_city = pg_city;
	}

	public String getPg_description() {
		return pg_description;
	}

	public void setPg_description(String pg_description) {
		this.pg_description = pg_description;
	}

	public String getPg_house_type() {
		return pg_house_type;
	}

	public void setPg_house_type(String pg_house_type) {
		this.pg_house_type = pg_house_type;
	}

	public String getPg_status() {
		return pg_status;
	}

	public void setPg_status(String pg_status) {
		this.pg_status = pg_status;
	}

	public int getPg_rent_price() {
		return pg_rent_price;
	}

	public void setPg_rent_price(int pg_rent_price) {
		this.pg_rent_price = pg_rent_price;
	}

	public String getPg_photo() {
		return pg_photo;
	}

	public void setPg_photo(String pg_photo) {
		this.pg_photo = pg_photo;
	}

}
