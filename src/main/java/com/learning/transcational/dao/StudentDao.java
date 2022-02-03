package com.learning.transcational.dao;

import com.learning.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,String> {
}
