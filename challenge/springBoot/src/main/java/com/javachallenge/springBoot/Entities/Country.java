package com.javachallenge.springBoot.Entities;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "country")
public class Country {

	@Id
	@Column(name = "country_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int country_id;
	
	@Column(name = "country")
	private String country;
	

	public Country() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Country(int country_id, String country) {
		super();
		this.country_id = country_id;
		this.country = country;
		
	}


	public int getCountryId() {
		return country_id;
	}
	public void setCountryId(int country_id) {
		this.country_id = country_id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
