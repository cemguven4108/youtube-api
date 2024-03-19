package com.cembo.youtube_api.dataAccess;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cembo.youtube_api.entities.YoutubeResponse;

@Repository
public interface YoutubeResponseRepository extends MongoRepository<YoutubeResponse, String>{
    
}
