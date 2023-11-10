package com.topdot.account.appliaction.service;

import com.topdot.account.interfaces.dto.AccountInfo;
import com.topdot.account.interfaces.dto.LoginAndRegisterDTO;

public interface LoginAndRegisterService {
    /**
     * 密码登录：0：账号，1：手机号
     */
    String loginByPassword(LoginAndRegisterDTO loginAndRegisterDTO);

    /**
     * 密码登录：2：手机验证码，3：邮箱验证码
     */
    String loginByCheckCode(LoginAndRegisterDTO loginAndRegisterDTO);

    String loginByBiologyInfo(LoginAndRegisterDTO loginAndRegisterDTO);

    /**
     * 发送验证码：2：手机验证码，3：邮箱验证码
     */
    Boolean sendCheckCode(LoginAndRegisterDTO loginAndRegisterDTO);

    Boolean register(LoginAndRegisterDTO loginAndRegisterDTO, AccountInfo accountInfo);
}
