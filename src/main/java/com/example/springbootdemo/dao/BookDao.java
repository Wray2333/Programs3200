package com.example.springbootdemo.dao;

import com.example.springbootdemo.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao {
    @Select("select * from tbl_book where id = #{id}")
    public Book getByID(Integer id);
}
