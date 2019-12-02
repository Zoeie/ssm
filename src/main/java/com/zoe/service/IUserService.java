package com.zoe.service;

import com.zoe.domain.User;

import java.util.List;

public interface IUserService {

    List<User> findAll();

    void saveUser(User user);

    User findUserById(int id);

}
