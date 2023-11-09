package com.topdot.account.infrastructure.constant;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {
    public Integer code;
    public String message;
}
