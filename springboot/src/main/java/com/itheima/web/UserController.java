package com.itheima.web;

import com.itheima.dao.UserDao;
import com.itheima.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/queryUser.do")
    public List<User> findAll(){
        List<User> users = userDao.findAll();
        return users;
    }
}
