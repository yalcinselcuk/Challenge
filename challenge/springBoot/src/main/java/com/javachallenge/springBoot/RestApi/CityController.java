package com.javachallenge.springBoot.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javachallenge.springBoot.Business.Interfaces.ICityServices;
import com.javachallenge.springBoot.Entities.City;

@RestController
@RequestMapping("/api")
public class CityController {

	private ICityServices cityServices;

	@Autowired
	public CityController(ICityServices cityServices) {
		super();
		this.cityServices = cityServices;
	}
	
	@GetMapping("/cities")
	public List<City> get(){
		return cityServices.getAll();
	}
	@PostMapping("/add")
	public void add(@RequestBody City city) {
		cityServices.add(city);

	}
	@PostMapping("/update")
	public void update(@RequestBody City city) {
		cityServices.update(city);

	}
	@PostMapping("/delete")
	public void delete(@RequestBody City city) {
		cityServices.delete(city);

	}
	@RequestMapping("/cities/{id}")
	public City getById(@PathVariable int id) {
		return cityServices.getById(id);
	}
}
