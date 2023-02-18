package com.dai8kadai.mybatisdemo.Service;

import com.dai8kadai.mybatisdemo.Model.Movie;
import java.util.List;

public interface MovieService {
    List<Movie> findAll();
    List<Movie> findMoviesByPublishedYear(Integer publishedYear);
}
