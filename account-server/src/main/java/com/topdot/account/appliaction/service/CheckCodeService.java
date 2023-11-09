package com.topdot.account.appliaction.service;

public interface CheckCodeService {
    /*发送手机验证码*/
    Boolean sendCheckCodeToPhone(String phone);
    /*发送邮箱验证码*/
    Boolean sendCheckCodeToMail(String mail);

    /*核验手机验证码*/
    Boolean checkCodePhone(String phone);

    /*核验邮箱验证码*/
    Boolean checkMailCode(String mail);
}
