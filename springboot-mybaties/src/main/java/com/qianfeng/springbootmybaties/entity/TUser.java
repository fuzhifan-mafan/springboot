package com.qianfeng.springbootmybaties.entity;


import lombok.Data;

@Data
public class TUser {
    private Long id;

    private String username;

    private String password;

    public TUser(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public TUser() {
    }


}