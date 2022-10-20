package com.thebmakes.requestms.repository;

import com.thebmakes.requestms.entity.Request;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends MongoRepository<Request, String> {

    // get Projects where users contain userId
   // List<Request> findByUsersContains(String userId);
}
