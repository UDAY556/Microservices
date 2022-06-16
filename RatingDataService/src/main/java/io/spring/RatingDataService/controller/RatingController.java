package io.spring.RatingDataService.controller;


import io.spring.RatingDataService.model.Rating;
import io.spring.RatingDataService.model.RatingData;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingdata")
public class RatingController {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(  movieId,1) ;
    }

    @RequestMapping("users/{userid}")
    public RatingData getRatingForUsers(@PathVariable("userid") String userid) {
        List<Rating> ratings = Arrays
                .asList(new Rating("123", 2)
                        , new Rating("124", 4));

        return new RatingData(ratings,userid);
    }
}
