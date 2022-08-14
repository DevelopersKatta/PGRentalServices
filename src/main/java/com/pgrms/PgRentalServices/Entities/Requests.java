package com.pgrms.PgRentalServices.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Requests {

	private int rq_id;
	private int owner_id;
	private int seeker_id;
	private int pg_house_id;

	public Requests() {
	}

	public Requests(int rq_id, int owner_id, int seeker_id, int pg_house_id) {
		this.rq_id = rq_id;
		this.owner_id = owner_id;
		this.seeker_id = seeker_id;
		this.pg_house_id = pg_house_id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getRq_id() {
		return rq_id;
	}

	public void setRq_id(int rq_id) {
		this.rq_id = rq_id;
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
