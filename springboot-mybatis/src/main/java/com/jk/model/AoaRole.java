package com.jk.model;

import java.io.Serializable;

public class AoaRole implements Serializable{
    private Long roleId;

    private String roleName;

    private Integer roleValue;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public Integer getRoleValue() {
        return roleValue;
    }

    public void setRoleValue(Integer roleValue) {
        this.roleValue = roleValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AoaRole aoaRole = (AoaRole) o;

        return roleId.equals(aoaRole.roleId);
    }

    @Override
    public int hashCode() {
        return roleId.hashCode();
    }

    @Override
    public String toString() {
        return "AoaRole{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", roleValue=" + roleValue +
                '}';
    }
}