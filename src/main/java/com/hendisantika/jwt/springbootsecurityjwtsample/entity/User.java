package com.hendisantika.jwt.springbootsecurityjwtsample.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

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
@Entity
@Table(name = "APP_USER")
@Data
public class User {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToMany
    @JoinColumn(name = "APP_USER_ID", referencedColumnName = "ID")
    private List<UserRole> roles;

}