package com.space.account.interfaces.facade;

import com.space.account.infrastructure.constant.ResponseCode;
import com.space.account.infrastructure.constant.ResponseMessage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceManageApi {

    @RequestMapping(value = "offlineAllDevice", method = RequestMethod.GET)
    public ResponseMessage offlineAllOtherDevice(){
        return ResponseMessage.success(ResponseCode.SUCCESS,null);
    }
}
