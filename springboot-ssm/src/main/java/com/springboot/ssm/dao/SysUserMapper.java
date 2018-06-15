package com.springboot.ssm.dao;

import com.springboot.ssm.domain.SysUser;

import java.util.List;

public interface SysUserMapper {

    /**
     * @return 用户管理列表
     * @methodname getSysUserList
     * @author nanzhou
     * @datetime 2018/4/16 下午2:38
     * @description: 获取用户管理列表
     */
    List<SysUser> getSysUserList();

}
