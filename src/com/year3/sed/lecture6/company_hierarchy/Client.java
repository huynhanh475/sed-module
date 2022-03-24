package com.year3.sed.lecture6.company_hierarchy;

public class Client {

    public static void main(String[] args) {
        Employee president = new Employee("President");
        Employee dean = new Employee("Dean");
        Employee lecturer = new Employee("Lecturer");
        Employee assistance = new Employee("Employee");

        president.addSubordinate(dean);
        dean.addSubordinate(lecturer);
        dean.addSubordinate(assistance);

        president.showHierarchy();

    }
}
