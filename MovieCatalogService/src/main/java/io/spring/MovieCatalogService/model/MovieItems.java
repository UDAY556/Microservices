package io.spring.MovieCatalogService.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class MovieItems {
    String name;
    String description;
    int rating;
}
