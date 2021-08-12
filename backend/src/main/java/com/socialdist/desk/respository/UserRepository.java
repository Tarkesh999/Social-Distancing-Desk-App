package com.socialdist.desk.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.socialdist.desk.model.UserModel;

@Repository
public interface UserRepository extends MongoRepository<UserModel, String>{

}
