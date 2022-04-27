package com.hubin.chats.controller;

import com.hubin.chats.services.UserService;
import com.hubin.chats.utils.ResultMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 需要token安全访问的Safe Api
 */
@Slf4j
@RestController
@RequestMapping("api")
public class SApiController {


    private final UserService userService;

    @Autowired
    SApiController(UserService userService){
        this.userService = userService;
    }

    /**
     * @param email
     * @return
     */
    @RequestMapping("logout")
    public ResultMap logout(@RequestParam("email")String email){
        ResultMap resultMap = new ResultMap();
        try {
            userService.logout(email);
            log.debug("登出成功");
            resultMap.setMessage("登出成功");
            resultMap.setStatus(200);
        }catch (Exception e){
            log.debug("登出异常");
            resultMap.setMessage("登出异常");
            resultMap.setStatus(400);
        }
        return resultMap;
    }

}
