package com.MyProjects.jobList.controller;

import com.MyProjects.jobList.model.Post;
import com.MyProjects.jobList.repository.SearchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.MyProjects.jobList.repository.PostRepo;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepo postRepo;

    @Autowired
    SearchRepo searchRepo;

    @ApiIgnore
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return postRepo.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return searchRepo.findByText(text);
    }

    @PostMapping("/post")
    public Post addPost(@RequestBody Post post){
        return postRepo.save(post);
    }
}
