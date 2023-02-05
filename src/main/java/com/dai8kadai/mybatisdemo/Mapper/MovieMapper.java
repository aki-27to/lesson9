package com.dai8kadai.mybatisdemo.Mapper;

import com.dai8kadai.mybatisdemo.Model.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//dbとの窓口
@Mapper
public interface MovieMapper {
    @Select("SELECT * FROM movies")
    List<Movie> findAll();//Method名でnamesに入っているものをListとして取り出す

    @Select("SELECT * FROM movies WHERE published_year = #{publishedYear}")
    List<Movie>findMoviesByPublishedYear(@Param("publishedYear")int publishedYear);

}
