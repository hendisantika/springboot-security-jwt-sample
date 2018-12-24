package com.hendisantika.jwt.springbootsecurityjwtsample.service;

import com.hendisantika.jwt.springbootsecurityjwtsample.entity.User;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-security-jwt-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-25
 * Time: 05:26
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    Optional<User> getByUsername(String username);
}