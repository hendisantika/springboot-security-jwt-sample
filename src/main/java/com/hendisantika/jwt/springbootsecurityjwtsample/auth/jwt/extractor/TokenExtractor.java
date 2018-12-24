package com.hendisantika.jwt.springbootsecurityjwtsample.auth.jwt.extractor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-security-jwt-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-25
 * Time: 06:29
 * To change this template use File | Settings | File Templates.
 */
public interface TokenExtractor {
    String extract(String payload);
}