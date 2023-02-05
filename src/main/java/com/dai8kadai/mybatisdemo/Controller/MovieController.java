package com.dai8kadai.mybatisdemo.Controller;

import com.dai8kadai.mybatisdemo.Model.Movie;
import com.dai8kadai.mybatisdemo.Service.MovieService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

//Serviceの窓口的存在
@Validated
@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }


    @GetMapping("/movies")
    public List<Movie> getMovies(@RequestParam(value = "published_year")Integer publishedYear){
        return movieService.findAll();
    }
}
