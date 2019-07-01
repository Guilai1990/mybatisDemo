package com.bruce.mapper;

import com.bruce.model.SysRole;
import com.bruce.model.SysUser;

import java.util.List;
import java.util.Map;

/**
 * @Author: Bruce
 * @Date: 2019/6/29 22:12
 * @Version 1.0
 */
public interface UserMapper {

    SysUser selectById(Long id);

    List<SysUser> selectAll();

    List<SysRole> selectRolesById(Long id);

    SysUser selectByIdOrUserName(SysUser sysUser);

    List<SysUser> selectByIdList(List<Long> idList);

    int insert(SysUser sysUser);

    int insertList(List<SysUser> userList);

    int updateById(SysUser sysUser);

    int updateByIdSelective(SysUser sysUser);

    int updateByMap(Map<String, Object> map);

    int deleteById(Long id);
}
