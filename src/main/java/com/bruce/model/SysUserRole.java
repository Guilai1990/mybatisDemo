package com.bruce.model;

/**
 * @Author: Bruce
 * @Date: 2019/6/29 17:05
 * @Version 1.0
 */
public class SysUserRole {

    private Long userId;

    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
