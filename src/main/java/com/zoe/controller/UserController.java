package com.zoe.controller;

import com.zoe.domain.User;
import com.zoe.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService service;

    @RequestMapping("findAll")
    public String findAll() {
        List<User> all = service.findAll();
        for (User user : all) {
            System.out.println(user);
        }
        return "success";
    }

    @RequestMapping("list")
    @ResponseBody
    public List<User> list() {
        return service.findAll();
    }

    @RequestMapping("saveUser")
    public String saveUser(User user) {
        service.saveUser(user);
        System.out.println("save user id:" + user.getId());
        return "success";
    }

    @RequestMapping("findUserById")
    @ResponseBody
    public User findUserById(int id) {
        return service.findUserById(id);
    }

}
