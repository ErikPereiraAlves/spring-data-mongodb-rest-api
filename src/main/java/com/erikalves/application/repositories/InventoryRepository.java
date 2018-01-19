package com.erikalves.application.repositories;


import com.erikalves.application.models.Inventory;
import com.erikalves.application.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "inventories", path = "inventories")
public interface InventoryRepository extends MongoRepository<Inventory, String> {
}
