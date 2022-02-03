package com.learning.corejava.factoryDesignPattern;


import com.learning.corejava.model.Employee;

public class EmailCommunication implements Communication {

    @Override
    public void process(Employee e) {

        System.out.println("communication via email");
    }
}
