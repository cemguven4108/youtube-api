package com.cembo.youtube_api.dataAccess;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cembo.youtube_api.entities.Data;

@Repository
public interface DataRepository extends MongoRepository<Data, String>{
    
}
