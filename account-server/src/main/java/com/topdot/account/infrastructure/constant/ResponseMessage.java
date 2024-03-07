package com.topdot.account.infrastructure.constant;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseMessage<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    Integer code;
    Boolean success;
    String message;
    T data;
    String timestamp;

    public ResponseMessage(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseMessage(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public static String getTimestamp(){
        return LocalDateTime.now(Clock.systemDefaultZone()).format(DateTimeFormatter.ISO_DATE_TIME);
    }
    public static <T> ResponseMessage<T> success(ResponseCode responseCode, T data) {
        ResponseMessage<T> responseMessage = new ResponseMessage<>();
        responseMessage.success = true;
        responseMessage.code = responseCode.getCode();
        responseMessage.message = responseCode.getMessage();
        responseMessage.timestamp = getTimestamp();
        responseMessage.data = data;
        return responseMessage;
    }

    public static <T> ResponseMessage<T> error(ErrorResponse errorResponse) {
        ResponseMessage<T> responseMessage = new ResponseMessage<>();
        responseMessage.success = false;
        responseMessage.code = errorResponse.getCode();
        responseMessage.message = errorResponse.getMessage();
        responseMessage.timestamp = getTimestamp();
        return responseMessage;
    }

}
