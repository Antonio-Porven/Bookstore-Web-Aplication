package com.example.newbookstore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.newbookstore.Models.Rating;

public interface RatingsRepo extends JpaRepository<Rating, Double> {


}
