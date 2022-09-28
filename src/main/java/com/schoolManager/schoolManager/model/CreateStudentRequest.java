package com.schoolManager.schoolManager.model;

public class CreateStudentRequest {
    private String fname;
    private String lname;
    private String enrolmentId;
    private String email;
    private String mobileNo;

    public String getFname() {
        return fname;
    }

    public CreateStudentRequest setFname(String fname) {
        this.fname = fname;
        return this;
    }

    public String getLname() {
        return lname;
    }

    public CreateStudentRequest setLname(String lname) {
        this.lname = lname;
        return this;
    }

    public String getEnrolmentId() {
        return enrolmentId;
    }

    public CreateStudentRequest setEnrolmentId(String enrolmentId) {
        this.enrolmentId = enrolmentId;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CreateStudentRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public CreateStudentRequest setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
}
