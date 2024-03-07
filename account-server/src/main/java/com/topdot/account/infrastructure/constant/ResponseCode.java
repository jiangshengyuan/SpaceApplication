package com.topdot.account.infrastructure.constant;

import lombok.Builder;

public enum ResponseCode {

    SUCCESS(200, "操作成功！"),
    Failure(201, "操作失败！"),
    ERROR(500, "系统异常！"),
    /**
     * 参数类
     * 1000
     */
    PARAM_ERROR(1000, ""),
    /**
     * 权限类
     * 2000
     */
    INVALID_TOKEN(2000, "token失效，请重新登陆！");

    private final int code;
    private final String message;

    ResponseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
