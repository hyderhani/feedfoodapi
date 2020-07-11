package com.feedfood.api;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.feedfood.api.models.Product;
import com.feedfood.api.repositories.ProductRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductRepository repository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Product> getAllProducts(){
		return repository.findAll();
	}
	
	@RequestMapping(value="{/id}", method = RequestMethod.GET)
	public Product getProductById(@PathVariable("id") ObjectId id) {
		return repository.findBy_id(id);
	}
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public Product createProduct(@Valid @RequestBody Product product) {
		product.set_id(ObjectId.get());
		repository.save(product);
		return product;
	}
	
	@RequestMapping(value="{/{id}", method = RequestMethod.PUT)
	public void modifyProductById(@PathVariable("id") ObjectId id, @Valid @RequestBody Product product) {
		product.set_id(id);
		repository.save(product);
	}
	
	@RequestMapping(value="{/id}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable ObjectId id) {
		repository.delete(repository.findBy_id(id));
	}
	

}
