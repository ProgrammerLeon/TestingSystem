package com.leon.data;

import javax.persistence.*;

@Entity
@Table(name = "StudentInfo", schema = "dbo", catalog = "ExamMaster")
public class StudentInfoEntity {
    private String studentId;
    private String studentName;
    private String studentGender;
    private String studentBatch;
    private String studentPw;

    public StudentInfoEntity(){}

    @Id
    @Column(name = "student_id")
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "student_name")
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Basic
    @Column(name = "student_gender")
    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    @Basic
    @Column(name = "student_batch")
    public String getStudentBatch() {
        return studentBatch;
    }

    public void setStudentBatch(String studentBatch) {
        this.studentBatch = studentBatch;
    }

    @Basic
    @Column(name = "student_pw")
    public String getStudentPw() {
        return studentPw;
    }

    public void setStudentPw(String studentPw) {
        this.studentPw = studentPw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentInfoEntity that = (StudentInfoEntity) o;

        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        if (studentName != null ? !studentName.equals(that.studentName) : that.studentName != null) return false;
        if (studentGender != null ? !studentGender.equals(that.studentGender) : that.studentGender != null)
            return false;
        if (studentBatch != null ? !studentBatch.equals(that.studentBatch) : that.studentBatch != null) return false;
        if (studentPw != null ? !studentPw.equals(that.studentPw) : that.studentPw != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (studentName != null ? studentName.hashCode() : 0);
        result = 31 * result + (studentGender != null ? studentGender.hashCode() : 0);
        result = 31 * result + (studentBatch != null ? studentBatch.hashCode() : 0);
        result = 31 * result + (studentPw != null ? studentPw.hashCode() : 0);
        return result;
    }
}
