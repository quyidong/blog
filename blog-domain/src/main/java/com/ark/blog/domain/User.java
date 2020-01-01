package com.ark.blog.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

/**
 * @author Ark
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    /**用户名*/
    @Column(length = 255)
    private String userName;

    /**电子邮箱*/
    @Column(length = 255)
    private String eMail;

    /**密码*/
    @Column(length = 255)
    private String password;

    /**上一次登录时间*/
    @Column(length = 255)
    private Date lastLoginTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}
