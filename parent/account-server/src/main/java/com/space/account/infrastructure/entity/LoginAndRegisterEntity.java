package com.space.account.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor
public class LoginAndRegisterEntity {
    String loginName;
    String password;
    String phone;
    String mail;
}
