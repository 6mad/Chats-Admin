package com.hubin.chats.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class MyUtil {

    //字符串加密
    public static String md5(String str) {
        return DigestUtils.md5Hex(str);
    }
}