package com.year3.sed;

import com.year3.sed.lecture1.Printer;
import com.year3.sed.lecture1.Printer1;
import com.year3.sed.lecture1.Printer2;
import com.year3.sed.lecture1.Printer3;
import com.year3.sed.lecture1.Printer4;
import com.year3.sed.lecture1.Printer5;

public class Main {

    public static void main(String[] args) {
        Printer d1 = new Printer1();
        Printer d2 = new Printer2();
        Printer d3 = new Printer3();
        Printer d4 = new Printer4();
        Printer d5 = new Printer5();

        d1.print();
        d2.print();
        d3.print();
        d4.print();
        d5.print();
    }
}
