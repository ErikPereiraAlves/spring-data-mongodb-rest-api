package com.erikalves.application.repositories;


import com.erikalves.application.models.Product;
import com.erikalves.application.models.Store;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "stores", path = "stores")
public interface StoreRepository extends MongoRepository<Store, String> {
}
