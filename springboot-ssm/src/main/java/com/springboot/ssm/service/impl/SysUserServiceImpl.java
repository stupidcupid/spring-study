package com.springboot.ssm.service.impl;

import com.springboot.ssm.dao.SysUserMapper;
import com.springboot.ssm.domain.SysUser;
import com.springboot.ssm.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> getSysUserList() {

        return sysUserMapper.getSysUserList();
    }
}
