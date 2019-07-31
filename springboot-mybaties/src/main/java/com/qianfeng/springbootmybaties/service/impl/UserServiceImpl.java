package com.qianfeng.springbootmybaties.service.impl;

import com.qianfeng.springbootmybaties.entity.TUser;
import com.qianfeng.springbootmybaties.mapper.TUserMapper;
import com.qianfeng.springbootmybaties.service.IUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author FuZhiFan
 * @Date 2019/7/30
 */
@Service
public class UserServiceImpl implements IUserservice{

    @Autowired
    private TUserMapper userMapper;
    @Override
    public TUser getById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
