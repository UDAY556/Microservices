package io.spring.RatingDataService.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Rating {

    private int rating;
    private String movieId;
}
