package com.feedfood.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feedfood.api.repositories.ProviderRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/profile")
public class ProviderController {
	
	@Autowired
	private ProviderRepository repository;
	
	@RequestMapping(value="/{userId}", method=RequestMethod.GET)
	public 

}
