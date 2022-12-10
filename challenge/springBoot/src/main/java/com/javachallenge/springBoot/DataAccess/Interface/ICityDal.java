package com.javachallenge.springBoot.DataAccess.Interface;

import java.util.List;

import com.javachallenge.springBoot.Entities.City;

public interface ICityDal {

	List<City> getAll();
	void add(City city);
	void update(City city);
	void delete(City city);
	City getById(int id);

}
