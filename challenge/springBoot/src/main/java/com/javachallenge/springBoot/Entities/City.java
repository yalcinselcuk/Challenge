package com.javachallenge.springBoot.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class City {

	@Id
	@Column(name = "city_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int city_id;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "country_id")
	private int country_id;
	
	
	public City() {
		// TODO Auto-generated constructor stub
	}


	public City(int city_id, String city, int country_id) {
		super();
		this.city_id = city_id;
		this.city = city;
		this.country_id = country_id;
	}


	public int getCity_id() {
		return city_id;
	}


	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getCountry_id() {
		return country_id;
	}


	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	
	

}
