package com.feedfood.api.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.feedfood.api.models.Provider;

public interface ProviderRepository extends MongoRepository<Provider, String> {
	
	Provider findBy_id(ObjectId _id);
}
