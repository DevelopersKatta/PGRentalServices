package com.pgrms.PgRentalServices.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wishlist {


	private int wl_id;
	private int seeker_id;
	private int pg_house_id;
	private long time;
	
	public Wishlist() {	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getWl_id() {
		return wl_id;
	}

	public void setWl_id(int wl_id) {
		this.wl_id = wl_id;
	}

	public int getSeeker_id() {
		return seeker_id;
	}

	public void setSeeker_id(int seeker_id) {
		this.seeker_id = seeker_id;
	}

	public int getPg_house_id() {
		return pg_house_id;
	}

	public void setPg_house_id(int pg_house_id) {
		this.pg_house_id = pg_house_id;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	
	
}
