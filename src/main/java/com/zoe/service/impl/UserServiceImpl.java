package com.zoe.service.impl;

import com.zoe.dao.IUserDao;
import com.zoe.domain.User;
import com.zoe.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

}
