package com.test.crudtest.repository;

import com.test.crudtest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("mongoUserRepository")
public interface UserRepository extends MongoRepository<User, Long> {
}

