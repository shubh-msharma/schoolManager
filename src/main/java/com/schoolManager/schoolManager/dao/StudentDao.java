package com.schoolManager.schoolManager.dao;

import com.schoolManager.schoolManager.model.Student;
import com.schoolManager.schoolManager.respository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class StudentDao {

    @Autowired
    private StudentRepo studentRepo;

    public void saveStudent(Student student){
        studentRepo.save(student);
    }

    public Student getStudentById(String id){
        return studentRepo.findById(id).orElse(null);
    }

    public List<Student> getAllStudents(int page, int records) {
        PageRequest pageRequest = PageRequest.of(page,records, Sort.by("createdOn").descending());
        return studentRepo.findAll(pageRequest).toList();
    }
}
