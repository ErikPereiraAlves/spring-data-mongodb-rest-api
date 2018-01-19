package com.erikalves.application.repositories;


import com.erikalves.application.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository  extends MongoRepository<Product, String> {
}
