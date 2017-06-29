package com.crossword;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

//@RepositoryRestResource(collectionResourceRel = "сrossword", path = "сrossword")
//public interface CrosswordRepository extends MongoRepository<Crossword, String> {


//}
