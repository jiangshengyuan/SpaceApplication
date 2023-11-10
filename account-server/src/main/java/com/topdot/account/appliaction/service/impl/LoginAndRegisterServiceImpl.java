package com.topdot.account.appliaction.service.impl;

import com.topdot.account.appliaction.service.SendAndCheckCodeService;
import com.topdot.account.appliaction.service.LoginAndRegisterService;
import com.topdot.account.interfaces.dto.AccountInfo;
import com.topdot.account.interfaces.dto.LoginAndRegisterDTO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

@Repository
public class LoginAndRegisterServiceImpl implements LoginAndRegisterService {
    @Resource
    SendAndCheckCodeService sendAndCheckCodeService;

    @Override
    public String loginByPassword(LoginAndRegisterDTO loginAndRegisterDTO) {
        if ("0".equals(loginAndRegisterDTO.getType())) {
        }
        if ("1".equals(loginAndRegisterDTO.getType())) {

        }
        return null;
    }

    @Override
    public String loginByCheckCode(LoginAndRegisterDTO loginAndRegisterDTO) {
        if ("2".equals(loginAndRegisterDTO.getType())) {

        }
        if ("3".equals(loginAndRegisterDTO.getType())) {

        }
        return null;
    }

    @Override
    public String loginByBiologyInfo(LoginAndRegisterDTO loginAndRegisterDTO) {
        return null;
    }

    @Override
    public Boolean sendCheckCode(LoginAndRegisterDTO loginAndRegisterDTO) {
        if ("2".equals(loginAndRegisterDTO.getType())) {
            sendAndCheckCodeService.sendCheckCodeToPhone(loginAndRegisterDTO.getPhone());
        }
        if ("3".equals(loginAndRegisterDTO.getType())) {
            sendAndCheckCodeService.sendCheckCodeToMail(loginAndRegisterDTO.getMail());
        }
        return Boolean.FALSE;
    }

    @Override
    public Boolean register(LoginAndRegisterDTO loginAndRegisterDTO, AccountInfo accountInfo) {
        return null;
    }

}
