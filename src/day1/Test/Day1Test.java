package day1.Test;

public class Day1Test {
    public static void main(String[] args) {
        // 1. Buat logic untuk ngecek apakah sebuah bilangan adalah bilangan prima
        System.out.println("=== NO.1 ===");
        int prima;
        int[] angkaPrima = {1,2,3,4,5,6};
            for (int i =0; i < angkaPrima.length; i++){
                prima = 0;
                for (int j=1; j <= i; j++){
                    if (i%j==0){
                        prima = prima+1;
                    }
                }
                if (prima == 2){
                    System.out.println("Bilangan prima : " + i);
                }
            }

        // 2. Buat logic untuk nyari nilai terbesar dan terkecil dari sebuah array pake Math.max & Math.min
        System.out.println("=== NO.2 ===");
        int[] angka = {1,2,3,4,5,6,7,8,9,10};
            int max = angka[0];
            int numberMax = 0;
            for (int i = 0; i < angka.length; i++){
                numberMax = angka[i];
                max = Math.max(max, numberMax);
            }
        System.out.println("Nilai tertinggi : " + max);

        int min = angka[0];
        int numberMin = 0;
        for (int i = 0; i < angka.length; i++){
            numberMin = angka[i];
            min = Math.min(min, numberMin);
        }
        System.out.println("Nilai terendah : " + min);

        // 3. Buat logic untuk nyari jumlah elemen yang nilainya genap dan jumlah elemen yang nilainya ganjil dari array angka
        System.out.println("=== NO.3 ===");
                for (int i = 0; i < angka.length; i++){
                    if (i%2 == 0){
                        System.out.println("Angka genap : " + i);
                    }
                }

                for (int i = 0; i < angka.length; i++){
                    if (i%2 != 0){
                        System.out.println("Angka ganjil : " + i);
                    }
                }
        // 4. Buat logic untuk menghitung jumlah karakter dalam sebuah string
        System.out.println("=== NO.4 ===");
        String kata = "aku sedang belajar java";
        System.out.println("Jumlah karakternya adalah : " + kata.length());

        // 5. Buat logic untuk menghitung jumlah huruf vokal dalam string "kata"
        System.out.println("=== NO.5 ===");
        int vokal = 0;
        char ch;
        for (int i = 0; i < kata.length(); i++){
            ch = kata.charAt(i);
            if (ch=='a'||ch=='i'||ch=='u'||ch=='e'||ch=='o'){
                vokal++;
            }
        }
        if (vokal > 0){
            System.out.println("Jumlah huruf vokal: " + vokal);
        }

        /* 6. Buat array yang terdiri dari 5 mahasiswa, masing-masing punya 3 nilai : Ujian, Absen, Kuis
        * kalkulasi nilai mereka berdasarkan rata2 nilai dari 3 nilai tsb
        * lalu tentukan Grade mereka berdasarkan nilai rata2 menggunakan logic if-else dan ENUM*/
        System.out.println("=== NO.6 ===");
        int[][] mahasiswa = {
                {10,10,9},
                {6,9,9},
                {6,9,9},
                {9,2,9},
                {8,9,8},
        };
        enum grade {
            A,B,C,D,E,F
        }
        for (int i = 0; i < mahasiswa.length; i++){
            int nilai = 0;
            System.out.print("Mahasiswa " + (i+1) + " : ");
            for (int j = 0; j < mahasiswa[i].length; j++) {
                nilai += mahasiswa[i][j];
            }
            int avg = nilai/3;
            if (avg >= 9){
                System.out.println(grade.A);
            } else if (avg >= 8){
                System.out.println(grade.B);
            } else if (avg >= 7){
                System.out.println(grade.C);
            } else if (avg >= 6){
                System.out.println(grade.D);
            } else if (avg >= 5){
                System.out.println(grade.E);
            } else {
                System.out.println(grade.F);
            }
        }
    }
}
