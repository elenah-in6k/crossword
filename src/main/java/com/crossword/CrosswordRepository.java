package com.crossword;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "crossword", path = "crossword")
public interface CrosswordRepository extends MongoRepository<Crossword, String> {
    @RestResource
    Page<Crossword> getByTestField(@Param("value") String testField, Pageable pageable);
}
