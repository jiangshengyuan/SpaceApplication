package com.space.account.appliaction.service;

import com.space.account.infrastructure.constant.ResponseMessage;
import com.space.account.interfaces.dto.LoginAndRegisterDTO;

public interface LoginAndRegisterAppService {
    ResponseMessage<Boolean> login(LoginAndRegisterDTO loginAndRegisterDTO);
}
