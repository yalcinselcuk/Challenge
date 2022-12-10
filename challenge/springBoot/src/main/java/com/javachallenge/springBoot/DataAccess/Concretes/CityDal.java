package com.javachallenge.springBoot.DataAccess.Concretes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javachallenge.springBoot.DataAccess.Interface.ICityDal;
import com.javachallenge.springBoot.Entities.City;

@Repository
public class CityDal implements ICityDal{

private EntityManager entityManager;
	
	@Autowired
	public CityDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	

	@Override
	@Transactional
	public List<City> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<City> city = session.createQuery("from City", City.class).getResultList();
		return city;
	}

	@Override
	public void add(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void update(City city) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(city);
		
	}

	@Override
	public void delete(City city) {
		Session session = entityManager.unwrap(Session.class);
		City cityToDelete= session.get(City.class,city.getCity_id());
		session.delete(cityToDelete);
		
	}

	@Override
	public City getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		City city= session.get(City.class, id);
		return city;
	}

}
