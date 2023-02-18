package com.dai8kadai.mybatisdemo.Mapper;

import com.dai8kadai.mybatisdemo.Model.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MovieMapper {
    @Select("SELECT * FROM movies")
    List<Movie> findAll();

    @Select("SELECT * FROM movies WHERE published_year = #{publishedYear}")
    List<Movie> findMoviesByPublishedYear(Integer publishedYear);
}


