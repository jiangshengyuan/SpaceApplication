package com.topdot.account.appliaction.service.impl;

import com.topdot.account.appliaction.service.SendAndCheckCodeService;
import org.springframework.stereotype.Repository;

@Repository
public class SendAndCheckCodeServiceImpl implements SendAndCheckCodeService {
    @Override
    public Boolean sendCheckCodeToPhone(String phone) {
        return null;
    }

    @Override
    public Boolean sendCheckCodeToMail(String phone) {
        return null;
    }

    @Override
    public Boolean checkCodePhone(String phone) {
        return null;
    }

    @Override
    public Boolean checkMailCode(String mail) {
        return null;
    }
}
