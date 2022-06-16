package io.spring.MovieCatalogService.controller;
import io.spring.MovieCatalogService.model.CatalogItem;
import io.spring.MovieCatalogService.model.Movie;
import io.spring.MovieCatalogService.model.Rating;
import io.spring.MovieCatalogService.model.RatingData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogService {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public List<CatalogItem>  getCatalogInfo(@PathVariable("userId")  String userId) {


        RatingData ratingData = restTemplate.getForObject("http://localhost:8082/ratingdata/users/" + userId, RatingData.class);


        List<Rating> ratings = ratingData.getRatings();

        List<CatalogItem> result = new ArrayList<>();

        for (Rating rating:ratings) {

            String movieId = rating.getMovieId();

            Movie movie = restTemplate.getForObject("http://localhost:8081/movies/" + movieId, Movie.class);

            if (movie !=null) {
                result.add(new CatalogItem(movie.getName(),"Good",rating.getRating()));
            }

        }

       return result;
   }
}
