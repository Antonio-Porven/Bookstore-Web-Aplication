package com.example.newbookstore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.newbookstore.Repository.CommentsRepo;
import com.example.newbookstore.Service.CommentService;

import java.util.List;


@RestController
public class Comments {
    @Autowired
    private CommentsRepo CommentsRepo;
    @Autowired
    private CommentService CommentService;

    @GetMapping(value = "/")
    public String GetPage() {
        return "Welcome";
    }

    //gets all comments
    @GetMapping(value = "/Allcomments")
    public List<com.example.newbookstore.Models.Comments> getComments() {
        return CommentsRepo.findAll();
    }

    //saves comments
    @PostMapping(value = ("/SavedComments"))
    public String saveComment(@RequestBody com.example.newbookstore.Models.Comments comments) {
        CommentsRepo.save(comments);
        return "Saved";
    }

    @GetMapping ("/Comments/{bookID}")
    public List<com.example.newbookstore.Models.Comments> getCommentsByBookID(@PathVariable("bookID")String bookID){
        return CommentService.getCommentsByBookID(bookID);
    }

}