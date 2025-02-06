package day2.OOP.Test;

/* 1. Buat object student dengan atribut nama, NIM, dan nilai
* lalu simpan data Student tersebut ke dalam ArrayList
* kemudian buat method berikut :
* 1. Menghitung rata-rata nilai Student
* 2. Cari nilai tertinggi
* 3. dan tampilkan data Student dengan nilai diatas rata-rata*/

import day2.OOP.Student.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Students> student = new ArrayList<>();

        student.add(new Students("Zain", 001, 90));
        student.add(new Students("Zaun", 002, 80));
        student.add(new Students("Zaen", 003, 70));
        student.add(new Students("Zaon", 004, 95));

        // Panggil method average
        System.out.println("=== NO.1 ===");
        int avg = cekRataRata(student);
        System.out.println("Rata-rata : " + avg);

        // Panggil method max
        System.out.println("=== NO.2 ===");
        int max = cekNilaiTertinggi(student);
        System.out.println("Nilai tertinggi : " + max);

        // Panggil
        System.out.println("=== NO.3 ===");
        cekNilaiDiatas(student);


    }

    // Method Average
    public static int cekRataRata(ArrayList<Students> student){
        int nilaiTotal = 0;
        for (Students students : student){
            nilaiTotal += students.nilai;
        }
        return nilaiTotal/ student.size();
    }

    // Method Nilai Tertinggi
    public static int cekNilaiTertinggi(ArrayList<Students> student){
        int nilaiTertinggi = 0;
        for (Students students : student){
            if (students.nilai > nilaiTertinggi){
                nilaiTertinggi = students.nilai;
            }
        }
        return nilaiTertinggi;
    }

    // Method Nilai Diatas Rata2
    public static void cekNilaiDiatas(ArrayList<Students> student){
        for (Students students : student){
            if (students.nilai > cekRataRata(student)){
                students.displayStudent();
            }
        }

    }

}
