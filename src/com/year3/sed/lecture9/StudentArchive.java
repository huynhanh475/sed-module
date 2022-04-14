package com.year3.sed.lecture9;

public class StudentArchive {
    private String[] studentsList = {"Nam", "Hanh", "Viet", "Duy"};

    public void printL2R() {
        for (String s : studentsList) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }

    public void printR2L() {
        for (int i = 0; i < studentsList.length; i ++) {
            System.out.print(studentsList[studentsList.length - i -1] + ", ");
        }
        System.out.println();
    }

}
