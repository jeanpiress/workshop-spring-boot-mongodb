package com.jeanpiress.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jeanpiress.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
