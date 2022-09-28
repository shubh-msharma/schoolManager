package com.schoolManager.schoolManager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    private String id;
    @Column(name = "first_name",length = 1000)
    private String firstName;
    @Column(name = "last_name",length = 1000)
    private String lastName;
    @Column(name = "created_on")
    private long createdOn;
    private boolean deleted;
    @Column(name = "phone_number")
    private long phoneNumber;
    @Column(name = "email",length = 2000)
    private String email;
    @Column(name = "enrollment_id",length = 1000)
    private String enrollmentId;

    public Student() {
    }

    public Student(String id, String firstName, String lastName, long createdOn, boolean deleted, long phoneNumber, String email, String enrollmentId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdOn = createdOn;
        this.deleted = deleted;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.enrollmentId = enrollmentId;
    }

    public String getId() {
        return id;
    }

    public Student setId(String id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Student setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public long getCreatedOn() {
        return createdOn;
    }

    public Student setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public Student setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Student setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public Student setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", createdOn=" + createdOn +
                ", deleted=" + deleted +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", enrollmentId='" + enrollmentId + '\'' +
                '}';
    }
}
