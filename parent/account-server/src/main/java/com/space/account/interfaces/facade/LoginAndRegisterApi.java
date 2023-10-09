package com.space.account.interfaces.facade;

import com.space.account.appliaction.service.LoginAndRegisterService;
import com.space.account.interfaces.dto.LoginAndRegisterDTO;
import jakarta.annotation.Resource;
import lombok.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginAndRegisterApi {
    @Resource
    LoginAndRegisterService loginAndRegisterService;
    @PostMapping(value = "/login")
    public String login(@NonNull LoginAndRegisterDTO loginAndRegisterDTO) {
        //密码登录
        if ("0".equals(loginAndRegisterDTO.getType()) || "1".equals(loginAndRegisterDTO.getType())) {
            return loginAndRegisterService.loginByPassword(loginAndRegisterDTO);
        }
        //验证码登录
        if ("2".equals(loginAndRegisterDTO.getType()) || "3".equals(loginAndRegisterDTO.getType())) {
            return loginAndRegisterService.loginByCheckCode(loginAndRegisterDTO);
        }
        //生物登录
        if ("4".equals(loginAndRegisterDTO.getType())) {
            return loginAndRegisterService.loginByBiologyInfo(loginAndRegisterDTO);
        }
        //关联账号登录
        if ("5".equals(loginAndRegisterDTO.getType())) {

        }
        return null;
    }
    @PostMapping(value = "/sendCheckCode")
    public Boolean sendCheckCode(@NonNull LoginAndRegisterDTO loginAndRegisterDTO) {
        //密码登录
        if ("2".equals(loginAndRegisterDTO.getType()) || "3".equals(loginAndRegisterDTO.getType())) {
             return loginAndRegisterService.sendCheckCode(loginAndRegisterDTO);
        }
        return false;
    }
    @PostMapping(value = "/register")
    public String register(@NonNull LoginAndRegisterDTO loginAndRegisterDTO) {
        return "";
    }

}
