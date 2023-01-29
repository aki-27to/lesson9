package com.dai8kadai.mybatisdemo;

import org.springframework.stereotype.Service;

import java.util.List;


public interface NameService {
    List<Name> findAll();
}
