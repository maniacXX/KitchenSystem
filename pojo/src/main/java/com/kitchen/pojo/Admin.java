package com.kitchen.pojo;

import javax.validation.constraints.Pattern;
import java.util.Date;

/**
 * @author chen
 */
public class Admin {
    private Long adminId;

    @Pattern(regexp = "(^[a-zA-Z0-9_-]{6,16}$)|(^[\\u2E80-\\u9FFF]{2,5}$)"
            , message = "管理员账号必须是2-5位中文或6-16位英文和数字的组合")
    private String adminName;

    @Pattern(regexp = "(^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,12}$)"
            , message = "密码必须是6到12位数字与字母组合")
    private String adminPassword;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}