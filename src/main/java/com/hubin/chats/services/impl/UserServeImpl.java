package com.hubin.chats.services.impl;

import com.hubin.chats.dao.UserDao;
import com.hubin.chats.model.User;
import com.hubin.chats.model.UserExample;
import com.hubin.chats.services.UserService;
import com.hubin.chats.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@Slf4j
@Service
public class UserServeImpl implements UserService {

    final
    UserDao userDao;

    @Autowired
    UserServeImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public User verifyToken(String Token) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andTokenEqualTo(Token);
        List<User> list = userDao.selectByExample(example);
        if (list.isEmpty()) return null;
        return list.get(0);
    }

    @Override
    public User login(String email, String password) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andEmailEqualTo(email);
        criteria.andPasswordEqualTo(password);
        List<User> list = userDao.selectByExample(example);
        if (!list.isEmpty()) {
            User user = list.get(0);
            final String Token = JwtUtil.generateToken(user.getId());
            user.setToken(Token);
            userDao.updateByPrimaryKeySelective(user);
            return user;
        };
        return null;
    }

    @Override
    public void logout(String email) {
        User user = getUserByEmail(email);
        user.setToken(null);
        userDao.updateByPrimaryKey(user);
    }

    @Override
    public boolean register(String email, String password) {
        User user;
        String name = "@" + System.currentTimeMillis() % 100000;
        user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setName(name);
        user.setAvatar("http://raacsmigj.bkt.clouddn.com/chats_avatar/logo.png");
        try {
            userDao.insertSelective(user);
        } catch (Exception sqlE) {
            if (sqlE instanceof SQLIntegrityConstraintViolationException) {
                log.info("注册有误！账号已存在");
            }
            log.info("注册异常！");
            return false;
        }
        return true;
    }

    private User getUserByEmail(String email){
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andEmailEqualTo(email);
        List<User> list = userDao.selectByExample(example);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }
}
