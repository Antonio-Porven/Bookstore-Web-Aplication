package com.example.newbookstore.Repository;

import com.example.newbookstore.Models.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentsRepo extends JpaRepository <Comments, String> {
    List<Comments> findCommentsByBookID(String bookID);

}