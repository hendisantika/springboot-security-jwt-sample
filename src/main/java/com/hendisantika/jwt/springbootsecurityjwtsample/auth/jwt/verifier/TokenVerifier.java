package com.hendisantika.jwt.springbootsecurityjwtsample.auth.jwt.verifier;

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
public interface TokenVerifier {
    boolean verify(String jti);
}