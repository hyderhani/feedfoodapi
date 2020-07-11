package com.feedfood.api.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.feedfood.api.models.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

	 Product findBy_id(ObjectId _id);
}
