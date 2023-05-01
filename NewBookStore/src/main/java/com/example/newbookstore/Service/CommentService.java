package com.example.newbookstore.Service;

import com.example.newbookstore.Models.Comments;
import com.example.newbookstore.Repository.CommentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService{
    @Autowired
    private CommentsRepo CommentsRepo;
    public List<Comments> getCommentsByBookID(String bookID) {
        return CommentsRepo.findCommentsByBookID(bookID);
    }

}
