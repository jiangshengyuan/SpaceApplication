package com.space.account.infrastructure.constant;

import lombok.Data;

@Data
public class GlobalException extends Exception{
    private Integer code;
    private String message;
}
