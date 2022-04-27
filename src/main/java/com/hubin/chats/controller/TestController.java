package com.hubin.chats.controller;

import com.hubin.chats.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class TestController {

    final
    UserDao userDao;

    public TestController(UserDao userDao) {
        this.userDao = userDao;
    }

}
