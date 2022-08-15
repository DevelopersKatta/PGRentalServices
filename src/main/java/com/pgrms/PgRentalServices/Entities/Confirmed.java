package com.pgrms.PgRentalServices.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Confirmed {
	private int cfm_id;
	private int owner_id;
	private int seeker_id;
	private int pg_house_id;

	public Confirmed() {
	}

	public Confirmed(int cfm_id, int owner_id, int seeker_id, int pg_house_id) {
		this.cfm_id = cfm_id;
		this.owner_id = owner_id;
		this.seeker_id = seeker_id;
		this.pg_house_id = pg_house_id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getcfm_id() {
		return cfm_id;
	}

	public void setcfm_id(int cfm_id) {
		this.cfm_id = cfm_id;
	}

	public int getOwner_id() {
		return owner_id;
	}

	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
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

}
