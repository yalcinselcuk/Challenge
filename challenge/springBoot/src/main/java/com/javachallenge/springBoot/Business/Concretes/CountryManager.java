package com.javachallenge.springBoot.Business.Concretes;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javachallenge.springBoot.Business.Interfaces.ICountryServices;
import com.javachallenge.springBoot.DataAccess.Interface.ICountryDal;
import com.javachallenge.springBoot.Entities.Country;

@Service
public class CountryManager implements ICountryServices{

	private ICountryDal countryDal;
	
	@Autowired
	public CountryManager(ICountryDal countryDal) {
		this.countryDal = countryDal;
	}
	
	@Override
	@Transactional
	public List<Country> getAll() {
		return this.countryDal.getAll();
	}

	@Override
	@Transactional
	public void add(Country country) {
		this.countryDal.add(country);
		
	}

	@Override
	@Transactional
	public void update(Country country) {
		this.countryDal.update(country);
		
	}

	@Override
	@Transactional
	public void delete(Country country) {
		this.countryDal.delete(country);
		
	}

	@Override
	@Transactional
	public Country getById(int id) {
		return this.countryDal.getById(id);
	}

	

}
