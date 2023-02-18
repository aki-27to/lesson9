package com.dai8kadai.mybatisdemo.Controller;

import com.dai8kadai.mybatisdemo.Model.Movie;
import com.dai8kadai.mybatisdemo.Service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Serviceの窓口的存在
@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> getMoviesByPublishedYear(@RequestParam(value = "published_year", required = false)Integer publishedYear){
        if (publishedYear != null) {
            return movieService.findMoviesByPublishedYear(publishedYear);
        }
        return movieService.findAll();
    }
}

/*
    @GetMapping("/movies")
    public List<Movie> getMoviesByPublishedYear(@RequestParam(value = "published_year")Integer publishedYear){
        return movieService.findMoviesByPublishedYear(publishedYear);
    }
    @GetMapping("/movies")
    public List<Movie> getMovies() {
        return movieService.findAll();
    }
*/
