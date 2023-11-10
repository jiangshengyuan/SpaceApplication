package com.space.account.appliaction.service.impl;

import com.space.account.appliaction.service.CheckCodeService;
import org.springframework.stereotype.Repository;

@Repository
public class CheckCodeServiceImpl implements CheckCodeService {
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
