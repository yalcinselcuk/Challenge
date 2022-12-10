package com.javachallenge.springBoot.Business.Interfaces;

import java.util.List;

import com.javachallenge.springBoot.Entities.City;

public interface ICityServices {

	List<City> getAll();

	void add(City city);

	void update(City city);

	void delete(City city);

	City getById(int id);

}
