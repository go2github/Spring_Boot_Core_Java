package com.learning.primary_qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("schoolstudent")
//@Primary
public class SchoolStudentImpl implements IStudent {

    @Override
    public void register() {

    }
}
