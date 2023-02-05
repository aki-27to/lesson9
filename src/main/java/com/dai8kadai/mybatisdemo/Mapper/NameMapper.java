package com.dai8kadai.mybatisdemo.Mapper;

import com.dai8kadai.mybatisdemo.Model.Name;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NameMapper {
    @Select("SELECT * FROM names")
    List<Name> findAll();//Method名でnamesに入っているものをListとして取り出す
}
