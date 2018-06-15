package com.springboot.ssm.controller;


import com.springboot.ssm.domain.SysUser;
import com.springboot.ssm.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    SysUserService sysUserService;

    @RequestMapping(value = "/getSysUserList")
    public List<SysUser> getSysUserList() {
        List<SysUser> user = sysUserService.getSysUserList();
        return user;
    }


}
