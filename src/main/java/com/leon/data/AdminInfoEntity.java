package com.leon.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "AdminInfo", schema = "dbo", catalog = "ExamMaster")
public class AdminInfoEntity {
    private String adminId;
    private String adminPw;

    @Basic
    @Column(name = "admin_id")
    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "admin_pw")
    public String getAdminPw() {
        return adminPw;
    }

    public void setAdminPw(String adminPw) {
        this.adminPw = adminPw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminInfoEntity that = (AdminInfoEntity) o;

        if (adminId != null ? !adminId.equals(that.adminId) : that.adminId != null) return false;
        if (adminPw != null ? !adminPw.equals(that.adminPw) : that.adminPw != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminId != null ? adminId.hashCode() : 0;
        result = 31 * result + (adminPw != null ? adminPw.hashCode() : 0);
        return result;
    }
}
