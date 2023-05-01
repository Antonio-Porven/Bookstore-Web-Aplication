package com.example.newbookstore.Controller;

import com.example.newbookstore.Models.Rating;
import com.example.newbookstore.Repository.RatingsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Ratings {

    @Autowired
    private RatingsRepo RatingsRepo;

    @PostMapping(value = ("/NewRating"))
    public String saveRating(@RequestBody Rating rating) {
        RatingsRepo.save(rating);
        return "Saved";
    }

    @GetMapping(value = "/AllRatings")
    public List<Rating> getRating() {
        return RatingsRepo.findAll();
    }

    @GetMapping(value = "/AvgRatings")
    public List<Rating> getAvgRating() {
        return RatingsRepo.findAll();
    }

}
