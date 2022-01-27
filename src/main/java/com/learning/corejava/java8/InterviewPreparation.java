package com.learning.corejava.java8;

import com.learning.corejava.model.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class InterviewPreparation {
    public static void main(String[] args) throws InterruptedException {

        List<Employee> list=getEmployees();

      // Comparator<Employee> compareByID=Comparator.comparing((e)->e.getId());
//how to use comparator
        Comparator<Employee> compareById_2 = Comparator.comparing(Employee::getAge);
//        Collections.sort(lst, compareById_2);
//        System.out.println(lst);
//
//        list.stream().sorted(compareById_2).forEach(
//                employee -> {
//                    System.out.println(employee);
//                }
//        );


//        Map<Integer,Employee> map=list.stream().collect(Collectors.toMap( (e) -> e.getId(), Function.identity()));
//        Set<Employee> set=list.stream().collect(Collectors.toSet());
//        List<Employee> m1=map.values().stream().collect(Collectors.toList());
//        for(Map.Entry<Integer,Employee> entry:map.entrySet()){
//            System.out.println("Key = " + entry.getKey() +
//                    ", Value = " + entry.getValue());
//
//        }
        Map<Integer,List<Employee>> gmap=list.stream().collect(
                Collectors.groupingBy(Employee::getAge));

        System.out.println(gmap);

    }
    private static List<Employee> getEmployees(){
        List<Employee> employees  = new ArrayList<>();
        employees.add(new Employee(6,"Yash", "Chopra", 25));
        employees.add(new Employee(2,"Aman", "Sharma", 28));
        employees.add(new Employee(3,"Aakash", "Yaadav", 52));
        employees.add(new Employee(5,"David", "Kameron", 19));
        employees.add(new Employee(6,"James", "Hedge", 72));
        employees.add(new Employee(8,"Balaji", "Subbu", 88));
        employees.add(new Employee(7,"Karan", "Johar", 28));
        employees.add(new Employee(1,"Lokesh", "Gupta", 32));
        employees.add(new Employee(9,"Vishu", "Bissi", 25));
        employees.add(new Employee(10,"Lokesh", "Ramachandran", 60));
        return employees;
    }
}
