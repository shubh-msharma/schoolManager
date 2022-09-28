package com.schoolManager.schoolManager.controller;

import com.schoolManager.schoolManager.model.CreateStudentRequest;
import com.schoolManager.schoolManager.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<?> getAllStudents(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "limit", required = false, defaultValue = "10") int records
    ) {
        return studentService.getAllStudents(page, records);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<?> getStudentById(
            @PathVariable("id") String id
    ) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/students")
    public ResponseEntity<?> createStudent(
            @RequestBody CreateStudentRequest createStudentRequest
    ) {
        return studentService.createStudent(createStudentRequest);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<?> updateStudent(
            @PathVariable("id") String id,
            @RequestBody CreateStudentRequest updateRequest
    ) {
        return studentService.updateStudent(id, updateRequest);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<?> deleteStudent(
            @PathVariable("id") String id
    ) {
        return studentService.deleteStudentRecord(id);
    }
}
