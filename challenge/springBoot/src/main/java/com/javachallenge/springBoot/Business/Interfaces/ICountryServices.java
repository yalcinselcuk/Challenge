package com.javachallenge.springBoot.Business.Interfaces;
import java.util.List;

import com.javachallenge.springBoot.Entities.Country;

public interface ICountryServices {

	List<Country> getAll();

	void add(Country country);

	void update(Country country);

	void delete(Country country);

	Country getById(int id);

}
