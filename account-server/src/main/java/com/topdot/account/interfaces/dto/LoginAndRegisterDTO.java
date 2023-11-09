package com.topdot.account.interfaces.dto;

import lombok.Data;

@Data
public class LoginAndRegisterDTO {
    String loginName;
    String password;
    // 登录方式：0：loginName+password，1:phone+password,2:mail+password,3:电话号码验证码,4:邮箱验证码
    String type;
    String phone;
    String mail;
}
