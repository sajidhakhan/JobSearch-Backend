package com.MyProjects.jobList.repository;

import com.MyProjects.jobList.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post,String> {

}
