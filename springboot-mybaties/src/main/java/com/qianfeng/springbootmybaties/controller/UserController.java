package com.qianfeng.springbootmybaties.controller;

import com.qianfeng.springbootmybaties.entity.TUser;
import com.qianfeng.springbootmybaties.service.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author FuZhiFan
 * @Date 2019/7/30
 */

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserservice userservice;

    @GetMapping("getById/{id}")
    public TUser getById(@PathVariable("id") Long id){
        return userservice.getById(id);
    }
}
