package com.hendisantika.jwt.springbootsecurityjwtsample.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-security-jwt-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-24
 * Time: 06:43
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "USER_ROLE")
public class UserRole {
    @Embeddable
    public static class Id implements Serializable {
        private static final long serialVersionUID = 1322120000551624359L;

        @Column(name = "APP_USER_ID")
        protected Long userId;

        @Enumerated(EnumType.STRING)
        @Column(name = "ROLE")
        protected Role role;

        public Id() {
        }

        public Id(Long userId, Role role) {
            this.userId = userId;
            this.role = role;
        }
    }

    @EmbeddedId
    Id id = new Id();

    @Enumerated(EnumType.STRING)
    @Column(name = "ROLE", insertable = false, updatable = false)
    protected Role role;

    public Role getRole() {
        return role;
    }
}
