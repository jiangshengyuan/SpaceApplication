package com.space.account.infrastructure.config;

import com.space.account.infrastructure.constant.ErrorResponse;
import com.space.account.infrastructure.constant.GlobalException;
import com.space.account.infrastructure.constant.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseMessage<ErrorResponse> handleException(GlobalException e) {
        log.error("全局异常信息：｛｝", e.getMessage());
        ErrorResponse errorResponse = new ErrorResponse(e.getCode(),e.getMessage());
        return ResponseMessage.error(errorResponse);
    }
}
