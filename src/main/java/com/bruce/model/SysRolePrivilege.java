package com.bruce.model;

/**
 * @Author: Bruce
 * @Date: 2019/6/29 17:36
 * @Version 1.0
 */
public class SysRolePrivilege {

    private Long roleId;

    private Long privilegeId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }
}
