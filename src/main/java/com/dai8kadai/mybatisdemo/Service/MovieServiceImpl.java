package com.dai8kadai.mybatisdemo.Service;

import com.dai8kadai.mybatisdemo.Mapper.MovieMapper;
import com.dai8kadai.mybatisdemo.Model.Movie;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieMapper movieMapper;

    public MovieServiceImpl(MovieMapper movieMapper) {
        this.movieMapper = movieMapper;
    }

    @Override
    public List<Movie> findAll() {
        return movieMapper.findAll();
    }
}
