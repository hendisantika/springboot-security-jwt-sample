package com.hendisantika.jwt.springbootsecurityjwtsample.security.exceptions;

import com.hendisantika.jwt.springbootsecurityjwtsample.security.model.token.JwtToken;
import org.springframework.security.core.AuthenticationException;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-security-jwt-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-25
 * Time: 05:38
 * To change this template use File | Settings | File Templates.
 */
public class JwtExpiredTokenException extends AuthenticationException {
    private static final long serialVersionUID = -5959543783324224864L;

    private JwtToken token;

    public JwtExpiredTokenException(String msg) {
        super(msg);
    }

    public JwtExpiredTokenException(JwtToken token, String msg, Throwable t) {
        super(msg, t);
        this.token = token;
    }

    public String token() {
        return this.token.getToken();
    }
}