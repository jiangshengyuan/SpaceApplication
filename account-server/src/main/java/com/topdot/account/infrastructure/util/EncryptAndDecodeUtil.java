package com.topdot.account.infrastructure.util;

import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncryptAndDecodeUtil {
    public String encryptByMD5(String src) {
        return DigestUtils.md5DigestAsHex(src.getBytes());
    }
    public String encodeByBase64(String src) {
        return Base64.getEncoder().encodeToString(src.getBytes());
    }
    public String decodeByBase64(String src) {
        return new String(Base64.getDecoder().decode(src.getBytes()), StandardCharsets.UTF_8);
    }
}
