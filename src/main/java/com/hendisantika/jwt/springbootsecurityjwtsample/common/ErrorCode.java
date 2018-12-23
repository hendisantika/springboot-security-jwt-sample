package com.hendisantika.jwt.springbootsecurityjwtsample.common;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-security-jwt-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-24
 * Time: 06:45
 * To change this template use File | Settings | File Templates.
 */
public enum ErrorCode {
    GLOBAL(2),

    AUTHENTICATION(10), JWT_TOKEN_EXPIRED(11);

    private int errorCode;

    ErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @JsonValue
    public int getErrorCode() {
        return errorCode;
    }
}
