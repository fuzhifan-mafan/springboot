package com.qianfeng.springbootmybaties.controller;

import com.qianfeng.springbootmybaties.entity.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author FuZhiFan
 * @Date 2019/7/30
 */
@Controller
@RequestMapping("page")
public class PageController {

    @RequestMapping("hello")
    public String hello(Model model){
        String username= "马云";
        model.addAttribute("username",username);

        TUser tUser =new TUser(1L,"zhangsan","123");
        
        model.addAttribute("tUser",tUser);

        model.addAttribute("money",10000);


        List<TUser> users =new ArrayList<>();
        users.add(new TUser(2L,"科比","123"));
        users.add(new TUser(3L,"卡哇伊","123"));
        model.addAttribute("users",users);

        model.addAttribute("now",new Date());
        return "hello";
    }
}
