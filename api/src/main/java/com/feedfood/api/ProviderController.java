package com.feedfood.api;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.feedfood.api.models.Provider;
import com.feedfood.api.repositories.ProviderRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/profile")
public class ProviderController {
	
	@Autowired
	private ProviderRepository repository;
	
	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
	public Provider getProductById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}
	 

}
