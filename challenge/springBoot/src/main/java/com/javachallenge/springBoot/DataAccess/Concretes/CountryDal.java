package com.javachallenge.springBoot.DataAccess.Concretes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javachallenge.springBoot.DataAccess.Interface.ICountryDal;
import com.javachallenge.springBoot.Entities.Country;

@Repository
public class CountryDal implements ICountryDal{

	private EntityManager entityManager;
	
	@Autowired
	public CountryDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public List<Country> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Country> countries = session.createQuery("from Country", Country.class).getResultList();
		return countries;
	}

	@Override
	public void add(Country country) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(country);
		
	}

	@Override
	public void update(Country country) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(country);
		
	}

	@Override
	public void delete(Country country) {
		Session session = entityManager.unwrap(Session.class);
		Country countryToDelete= session.get(Country.class,country.getCountryId());
		session.delete(countryToDelete);
		
	}
	@Override
	public Country getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Country country = session.get(Country.class, id);
		return country;
	}

	

}
