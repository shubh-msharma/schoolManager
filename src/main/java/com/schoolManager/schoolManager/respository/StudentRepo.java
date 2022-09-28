package com.schoolManager.schoolManager.respository;

import com.schoolManager.schoolManager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,String> {

}
