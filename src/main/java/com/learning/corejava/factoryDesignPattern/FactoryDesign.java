package com.learning.corejava.factoryDesignPattern;


import com.learning.corejava.model.Employee;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class FactoryDesign {

    public static void main(String[] args){
        Employee employee=new Employee("mobile");
        Employee employee1=new Employee("email");

        List<Employee> list=new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        CommunicationFactory cf=new CommunicationFactory();
        for(Employee e:list){
           Communication c= cf.getCommunicationInstace(e.getModeOfContact());
           c.process(e);
        }

    }
}
