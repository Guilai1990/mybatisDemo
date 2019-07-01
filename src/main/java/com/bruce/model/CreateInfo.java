package com.bruce.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Bruce
 * @Date: 2019/6/29 17:37
 * @Version 1.0
 */
public class CreateInfo implements Serializable {

    private static final long serialVersionUID = 5509682196029232558L;

    private String createBy;

    private Date createTime;

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
