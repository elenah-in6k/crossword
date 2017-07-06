package com.crossword;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.mongodb.repository.MongoRepository;

@RepositoryRestResource(collectionResourceRel = "сrossword", path = "сrossword")
public interface CrosswordRepository extends MongoRepository<Crossword, String> {


}
