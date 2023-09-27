package com.space.account.infrastructure.util;

import org.springframework.util.DigestUtils;

public class MD5Util {
    public static final String LOGIN_SALT = "";
    public static final String REGISTER_SALT = "";

    public String generatePassword(String password){
        return DigestUtils.md5DigestAsHex(password.getBytes());
    }
}
