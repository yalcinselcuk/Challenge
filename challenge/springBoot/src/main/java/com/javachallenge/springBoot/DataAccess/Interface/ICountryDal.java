package com.javachallenge.springBoot.DataAccess.Interface;

import java.util.List;

import com.javachallenge.springBoot.Entities.Country;

public interface ICountryDal {
	List<Country> getAll();
	void add(Country Country);
	void update(Country Country);
	void delete(Country Country);
	Country getById(int id);
	
}
