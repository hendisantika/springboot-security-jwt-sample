package com.hendisantika.jwt.springbootsecurityjwtsample.entity;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-security-jwt-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-24
 * Time: 06:42
 * To change this template use File | Settings | File Templates.
 */
public enum Role {
    ADMIN, PREMIUM_MEMBER, MEMBER;

    public String authority() {
        return "ROLE_" + this.name();
    }
}