package com.hendisantika.jwt.springbootsecurityjwtsample.auth.jwt.verifier;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-security-jwt-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-26
 * Time: 05:37
 * To change this template use File | Settings | File Templates.
 */
@Component
public class BloomFilterTokenVerifier implements TokenVerifier {
    @Override
    public boolean verify(String jti) {
        return true;
    }
}