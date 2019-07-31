package com.qianfeng.springbootmybaties.service;

import com.qianfeng.springbootmybaties.entity.TUser;

/**
 * @author FuZhiFan
 * @Date 2019/7/30
 */
public interface IUserservice {

    TUser getById(Long id);
}
