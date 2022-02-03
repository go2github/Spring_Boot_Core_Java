package com.learning.primary_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class PrimaryVsQualifer {
    @Autowired
    @Qualifier("schoolstudent")
    IStudent iStudent;

    @PostConstruct
    void init(){
        System.out.println("********************************");
        System.out.println("Primary and qualifier initialized");
        System.out.println("********************************");
    }

}
