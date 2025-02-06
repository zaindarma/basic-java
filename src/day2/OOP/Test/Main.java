package day2.OOP.Test;

/* 1. Buat object student dengan atribut nama, NIM, dan nilai
* lalu simpan data Student tersebut ke dalam ArrayList
* kemudian buat method berikut :
* 1. Menghitung rata-rata nilai Student
* 2. Cari nilai tertinggi
* 3. dan tampilkan data Student dengan nilai diatas rata-rata*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Students> student = new ArrayList<>();

        student.add(new Students("Zain", 001, 90));
        student.add(new Students("Zaun", 002, 80));
        student.add(new Students("Zaen", 003, 70));

        // Panggil method
        double avg = cekRataRata(student);
        System.out.println("Rata-rata : " + avg);
    }

    // Method Average
    public static int cekRataRata(ArrayList<Students> student){
        int nilaiTotal = 0;
        for (Students students : student){
            nilaiTotal += students.nilai;
        }
        return nilaiTotal/ student.size();
    }

}
