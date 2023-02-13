package com.MyProjects.jobList.repository;

import com.MyProjects.jobList.model.Post;

import java.util.List;

public interface SearchRepo {

   List<Post> findByText(String text);
}
