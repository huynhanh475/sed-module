package com.year3.sed.lecture6.company_hierarchy;

import java.util.ArrayList;

public class Employee {

    private String name;
    
    private ArrayList<Employee> subordinates = new ArrayList<Employee>();
    
    Employee(){}
    
    Employee(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSubordinate(Employee employee) {
        this.subordinates.add(employee);
    }
    
    public void removeSubordinate(Employee employee) {
        this.subordinates.remove(employee);
    }

    public void showHierarchy() {
        System.out.println(this.name);
        for (Employee supervisee : this.subordinates) {
            supervisee.showHierarchy(1);
        }
    }
    //This one is just to beautify the output
    private void showHierarchy(int level) {
        System.out.format("%1$" + level*2 + "s" + this.name + "\n", "--");
        for (Employee supervisee : this.subordinates) {
            supervisee.showHierarchy(level + 1);
        }
    }
}
