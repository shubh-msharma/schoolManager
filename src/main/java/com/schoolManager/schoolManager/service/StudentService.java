package com.schoolManager.schoolManager.service;

import com.schoolManager.schoolManager.dao.StudentDao;
import com.schoolManager.schoolManager.model.CreateStudentRequest;
import com.schoolManager.schoolManager.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public ResponseEntity<?> getAllStudents(int page, int records) {
        List<Student> studentList = studentDao.getAllStudents(page, records);
        return ResponseEntity.status(200).body(studentList);
    }

    public ResponseEntity<?> getStudentById(String id) {
        Student student = studentDao.getStudentById(id);
        return ResponseEntity.status(200).body(student);
    }

    public ResponseEntity<?> createStudent(CreateStudentRequest request) {
        Student student = new Student();
        student.setId(UUID.randomUUID().toString());
        student.setEmail(request.getEmail());
        student.setEnrollmentId(request.getEnrolmentId());
        student.setLastName(request.getLname());
        student.setFirstName(request.getFname());
        student.setPhoneNumber(Long.parseLong(request.getMobileNo()));
        student.setCreatedOn(Instant.now().toEpochMilli());
        studentDao.saveStudent(student);
        return ResponseEntity.status(200).body("save student records");
    }

    public ResponseEntity<?> updateStudent(String id, CreateStudentRequest updateRequest) {
        Student student = studentDao.getStudentById(id);
        if (student == null) {
            return ResponseEntity.status(400).body("no student records found for given id");
        }
        if (updateRequest.getEmail() != null && updateRequest.getEmail().equals(student.getEmail()) == false)
            student.setEmail(updateRequest.getEmail());
        if (updateRequest.getEnrolmentId() != null && updateRequest.getEnrolmentId().equals(student.getEnrollmentId()) == false)
            student.setEnrollmentId(updateRequest.getEnrolmentId());
        if (updateRequest.getLname() != null && updateRequest.getLname().equals(student.getLastName()) == false)
            student.setLastName(updateRequest.getLname());
        if (updateRequest.getFname() != null && updateRequest.getFname().equals(student.getFirstName()) == false)
            student.setFirstName(updateRequest.getFname());
        if (updateRequest.getMobileNo() != null && updateRequest.getMobileNo().equals(String.valueOf(student.getPhoneNumber())) == false)
            student.setPhoneNumber(Long.parseLong(updateRequest.getMobileNo()));
        studentDao.saveStudent(student);
        System.out.println(student);
        return ResponseEntity.status(200).body("updated student records");
    }

    public ResponseEntity<?> deleteStudentRecord(String id) {
        Student student = studentDao.getStudentById(id);
        if (student != null) {
            student.setDeleted(true);
            studentDao.saveStudent(student);
        }
        return ResponseEntity.status(200).body("deleted student record");
    }
}
