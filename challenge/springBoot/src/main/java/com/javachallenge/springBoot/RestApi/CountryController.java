package com.javachallenge.springBoot.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javachallenge.springBoot.Business.Interfaces.ICountryServices;
import com.javachallenge.springBoot.Entities.Country;

@RestController
@RequestMapping("/api2")
public class CountryController {

	private ICountryServices countryServices;

	@Autowired
	public CountryController(ICountryServices countryServices) {
		super();
		this.countryServices = countryServices;
	}
	
	@GetMapping("/countries")
	public List<Country> get(){
		return countryServices.getAll();
	}
	@PostMapping("/add")
	public void add(@RequestBody Country country) {
		countryServices.add(country);

	}
	@PostMapping("/update")
	public void update(@RequestBody Country country) {
		countryServices.update(country);

	}
	@PostMapping("/delete")
	public void delete(@RequestBody Country country) {
		countryServices.delete(country);

	}
	@RequestMapping("/countries/{id}")
	public Country getById(@PathVariable int id) {
		return countryServices.getById(id);
	}
}
