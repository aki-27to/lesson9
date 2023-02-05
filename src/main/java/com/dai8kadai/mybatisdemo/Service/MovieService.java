package com.dai8kadai.mybatisdemo.Service;

import com.dai8kadai.mybatisdemo.Model.Movie;
import com.dai8kadai.mybatisdemo.Model.Name;

import java.util.List;

//Mybatisとの窓口
public interface MovieService {
    List<Movie> findAll();
}
