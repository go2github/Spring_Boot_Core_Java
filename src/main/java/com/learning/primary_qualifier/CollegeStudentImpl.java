package com.learning.primary_qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("collegestudent")
//@Primary
public class CollegeStudentImpl implements IStudent {
    @Override
    public void register() {


    }
}
