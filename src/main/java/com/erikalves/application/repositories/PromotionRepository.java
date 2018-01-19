package com.erikalves.application.repositories;


import com.erikalves.application.models.Product;
import com.erikalves.application.models.Promotion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "promotions", path = "promotions")
public interface PromotionRepository extends MongoRepository<Promotion, String> {
}
