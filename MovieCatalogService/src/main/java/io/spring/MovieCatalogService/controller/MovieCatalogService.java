package io.spring.MovieCatalogService.controller;
import io.spring.MovieCatalogService.model.MovieItems;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogService {

    @RequestMapping("/{userId}")
   public List<MovieItems>  getMovieItems(@PathVariable("userId")  String userId) {

       return Collections.singletonList(new MovieItems("Transformers","good",4));
   }
}
