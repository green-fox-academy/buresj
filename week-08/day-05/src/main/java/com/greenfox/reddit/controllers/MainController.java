package com.greenfox.reddit.controllers;

import com.greenfox.reddit.entities.Post;
import com.greenfox.reddit.repositories.PostsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private PostsRepo repo;

    @Autowired
    public MainController(PostsRepo repo){
        this.repo = repo;
    }

    @GetMapping("/")
    public String displayAll(Model model, @RequestParam(required = false) String username){
        model.addAttribute("newPost", new Post());
        model.addAttribute("middle", "showAll");
        model.addAttribute("posts", repo.all());
        model.addAttribute("ordered",repo.orderedPosts());
        return "main";
    }

    @GetMapping("/{id}")
    public String displayPost(Model model, @PathVariable Integer id, @RequestParam(required = false) String username){
        model.addAttribute("newPost", new Post());
        model.addAttribute("middle", "showPost");
        model.addAttribute("selectedPost", repo.findById(new Long(id)));
        return "main";
    }

    @PostMapping("/add")
    public String addPost(@ModelAttribute Post post, @RequestParam(required = false) String username){
        repo.save(post);
        return "redirect:/" + username;
    }

    @GetMapping("/minus/{id}")
    public String decrement(@PathVariable Integer id, @RequestParam(required = false) String username){
        Post post = repo.findById(new Long(id)).get();
        post.decrement();
        repo.save(post);
        return "redirect:/" + username;
    }

    @GetMapping("/plus/{id}")
    public String increment(@PathVariable Integer id, @RequestParam(required = false) String username){
        Post post = repo.findById(new Long(id)).get();
        post.increment();
        repo.save(post);
        return "redirect:/" + username;
    }
}
