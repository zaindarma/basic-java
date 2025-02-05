package day1.Logic;

public class LogicStatement {
    public static void main(String[] args) {
        // If
        int nilai = 10;
        if(nilai == 10) {
            System.out.println("Nilaimu bagus");
        }

        int nilaiSiswa = 75;
        // If Else
        if (nilaiSiswa == 70) {
            System.out.println("Nilaimu KKM");
        } else {
            System.out.println("Nilaimu Belum KKM");
        }

        // If Else If
        if (nilaiSiswa >= 90) {
            System.out.println("Nilai A");
        } else if (nilaiSiswa >= 75){
            System.out.println("Nilai B");
        } else {
            System.out.println("Nilai C");
        }

        // Switch Case
        char grade = 'C';
        switch (grade){
            case 'A':
                System.out.println("Sangat Baik");
                break;
            case 'B':
                System.out.println("Baik");
                break;
            case 'C':
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Nilai Tidak Valdi");
        }
    }
}
