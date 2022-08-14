package com.pgrms.PgRentalServices.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reviews {

	private int rv_id;
	private int owner_id;
	private int seeker_id;
	private int pg_house_id;
	private String ctime;
	private String comments;

	public Reviews() {
	}

	public Reviews(int rv_id, int owner_id, int seeker_id, int pg_house_id, String ctime, String comments) {
		this.rv_id = rv_id;
		this.owner_id = owner_id;
		this.seeker_id = seeker_id;
		this.pg_house_id = pg_house_id;
		this.ctime = ctime;
		this.comments = comments;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getRv_id() {
		return rv_id;
	}

	public void setRv_id(int cfm_id) {
		this.rv_id = cfm_id;
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

	public String getTime() {
		return ctime;
	}

	public void setTime(String time) {
		this.ctime = time;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

}
