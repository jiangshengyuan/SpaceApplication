package com.space.account.interfaces.facade;

import com.space.account.interfaces.dto.LoginAndRegisterDTO;
import lombok.NonNull;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginAndRegisterApi {

    @PostMapping(value = "/login")
    public String login(@NonNull LoginAndRegisterDTO loginAndRegisterDTO) {
        if ("0".equals(loginAndRegisterDTO.getType())) {

        }
        if ("1".equals(loginAndRegisterDTO.getType())) {

        }
        if ("2".equals(loginAndRegisterDTO.getType())) {

        }
        if ("3".equals(loginAndRegisterDTO.getType())) {

        }
        return "";
    }

    @PostMapping(value = "/register")
    public String register(@NonNull LoginAndRegisterDTO loginAndRegisterDTO) {
        return "";
    }

}
