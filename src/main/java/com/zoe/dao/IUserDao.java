package com.zoe.dao;

import com.zoe.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao {

    List<User> findAll();

    void saveUser(User user);

    User findUserById(int id);

}
