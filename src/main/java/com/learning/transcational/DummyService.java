package com.learning.transcational;

import com.learning.entity.Student;
import com.learning.transcational.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.IOException;


@Service
public class DummyService {




@Autowired
    StudentDao dao;

    @Transactional(readOnly = false,rollbackFor = NullPointerException.class)
    public void saveObj()throws IOException {
        Student student=new Student();
        student.setId("1");
        student.setName("sheik");
        dao.save(student);
       // throw new IOException();

    }
}
