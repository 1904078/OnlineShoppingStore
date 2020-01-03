package com.onlineshoppingstore.User.Repository;

import com.onlineshoppingstore.User.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
