package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class User implements Serializable{
    private static final long serialVersionUID = 3375940224351043760L;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer userId;
    private String loginId;
    private String email;
    private String password;
    private String uuid;
    private LocalDateTime createDate;

    public User(){}

    public User(String loginId, String email, String password, String uuid, LocalDateTime createDate) {
        this.loginId = loginId;
        this.email = email;
        this.password = password;
        this.uuid = uuid;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", loginId='" + loginId + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", uuid='" + uuid + '\'' +
                ", createDate=" + createDate +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}