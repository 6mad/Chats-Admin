package com.hubin.chats.services;

import com.hubin.chats.model.User;

public interface UserService {
    User verifyToken(String Token);
    User login(String email,String password);

    void logout(String email);

    boolean register(String email, String md5);
}
