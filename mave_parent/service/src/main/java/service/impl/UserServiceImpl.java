package service.impl;

import com.bianyiit.dao.UserDao;
import com.bianyiit.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao dao;
    public List<User> findAll() {
        return dao.findAll();
    }
}
