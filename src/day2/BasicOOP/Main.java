package day2.BasicOOP;

import day2.BasicOOP.Basic.*;

public class Main {
    public static void main(String[] args) {
        // Instance creation dari class Human : proses bikin objek baru dari sebuah class
        Human student = new Human("Imron", 30);

        // Instance method : methid yang bisa diakses oleh objek yang menampung suatu class
        student.fart();
        student.breath();
    }
}
