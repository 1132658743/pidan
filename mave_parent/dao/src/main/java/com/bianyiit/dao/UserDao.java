package com.bianyiit.dao;

import com.bianyiit.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface UserDao {
    @Select("select * from stu")
    List<User> findAll();
}
