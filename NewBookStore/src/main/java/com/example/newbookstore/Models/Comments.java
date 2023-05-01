package com.example.newbookstore.Models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Comments {


//    Date currentDate = new Date();
//    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
//    String formattedDateTime = dateFormat.format(currentDate);

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userID;
    //private long commentId;
//    @Column
//    private String userID;
    @Column
    private String Comment;
    @Column
    private String bookID;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING)
    @Column(name = "timeStamp")
    private String timeStamp;
    //    @Column
//    private String Timestamp = formattedDateTime;


//    public long getCommentId() {
//        return commentId;
//    }
//
//    public void setCommentId(long commentId) {
//        this.commentId = commentId;
//    }

    public String getUserID(){
        return userID;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public String getComment(){
        return Comment;
    }

    public Comments setComment(String comment) {
        Comment = comment;
        return this;
    }

    public String getbookID() {
        return bookID;
    }

    public void setbookID(String bookID) {
        this.bookID = bookID;

    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    //    public String getTimestamp(){
//        return getTimestamp();
//    }

}