package com.example.newbookstore.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class user {
    @Id
    @Column
    private String UserID;

    public String getUserID(){
        return UserID;
    }

    public void setUserID(String userID) {
        this.UserID = UserID;
    }
}

