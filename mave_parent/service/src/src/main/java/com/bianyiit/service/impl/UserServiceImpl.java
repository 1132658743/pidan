package com.bianyiit.service.impl;

import com.bianyiit.dao.UserDao;
import com.bianyiit.domain.User;
import com.bianyiit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao dao;
    public List<User> findAll() {
        return dao.findAll();
    }
}
