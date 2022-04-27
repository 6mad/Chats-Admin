package com.hubin.chats.controller;

import com.hubin.chats.model.User;
import com.hubin.chats.services.ChatService;
import com.hubin.chats.services.UserService;
import com.hubin.chats.utils.MyUtil;
import com.hubin.chats.utils.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class MainController {
    private final UserService userService;
    private final ChatService chatService;

    @Autowired MainController(UserService userService, ChatService chatService){
        this.userService = userService;
        this.chatService = chatService;
    }

    @RequestMapping("login")
    public ResultMap login(@RequestParam("email")String email,@RequestParam("password")String password){
            ResultMap<User> resultMap = new ResultMap<>();
            User user = userService.login(email,MyUtil.md5(password));
            resultMap.setObject(user);
            return resultMap;
    }

    @RequestMapping("register")
    public ResultMap register(@RequestParam("email")String email,@RequestParam("password")String password){
        ResultMap resultMap = new ResultMap();
        if (userService.register(email, MyUtil.md5(password))){
            resultMap.setStatus(200);
        }else {
            resultMap.setStatus(400);
        }
        return resultMap;
    }

    @RequestMapping("chatslist/{type}")
    public ResultMap register(@PathVariable("type")String  type){
        ResultMap resultMap = new ResultMap();
        if (type.equals("hots")){
            List<Map> list = chatService.getHotChatsList();
        }

        return resultMap;
    }


}
