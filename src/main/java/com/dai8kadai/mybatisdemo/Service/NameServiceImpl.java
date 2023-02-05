package com.dai8kadai.mybatisdemo.Service;

import com.dai8kadai.mybatisdemo.Mapper.NameMapper;
import com.dai8kadai.mybatisdemo.Model.Name;
import com.dai8kadai.mybatisdemo.Service.NameService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NameServiceImpl implements NameService {

private final NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @Override
    public List<Name> findAll() {
        return nameMapper.findAll();
    }
}
