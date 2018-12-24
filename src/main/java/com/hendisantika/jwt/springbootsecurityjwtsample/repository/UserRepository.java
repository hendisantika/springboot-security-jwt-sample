package com.hendisantika.jwt.springbootsecurityjwtsample.repository;

import com.hendisantika.jwt.springbootsecurityjwtsample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-security-jwt-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-25
 * Time: 05:24
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u left join fetch u.roles r where u.username=:username")
    Optional<User> findByUsername(@Param("username") String username);
}