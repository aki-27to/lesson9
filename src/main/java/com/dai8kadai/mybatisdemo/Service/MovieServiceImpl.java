package com.dai8kadai.mybatisdemo.Service;

import com.dai8kadai.mybatisdemo.Mapper.MovieMapper;
import com.dai8kadai.mybatisdemo.Model.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieMapper movieMapper;

    @Autowired
    public MovieServiceImpl(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    @Override
    public List<Movie> findAll() {
        return movieMapper.findAll();
    }

    @Override
    public List<Movie> findMoviesByPublishedYear(Integer publishedYear) {
        return movieMapper.findMoviesByPublishedYear(publishedYear);
    }
}
