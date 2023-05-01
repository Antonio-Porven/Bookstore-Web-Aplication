package com.example.newbookstore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
@Entity
public class Rating {
    @Id
    @Column
    private String UserID;
    @Column
    private long BookID;
    @Column
    private double Rating;
    Date date = new Date();
    Timestamp ts=new Timestamp(date.getTime());
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public String getUserID(){

        return UserID;
    }

    public void setUserID(String userID) {

        this.UserID = UserID;
    }
    public long getBookID() {

        return BookID;
    }

    public void setBookID(long bookID) {
        BookID = bookID;
    }

    public double getRating() {
        return Rating;
    }

    public void setRating(double rating) {
        Rating = rating;
    }
}