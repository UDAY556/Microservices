package io.spring.MovieCatalogService.controller;
import io.spring.MovieCatalogService.model.CatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogService {

    @RequestMapping("/{userId}")
   public List<CatalogItem>  getCatalogInfo(@PathVariable("userId")  String userId) {

       return Collections.singletonList(new CatalogItem("Transformers","good",4));
   }
}
