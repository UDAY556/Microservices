package io.spring.RatingDataService.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@Getter
@Setter
public class RatingData {

    List<Rating> ratings;
    String userId;
}

