package day1.Basic;

/* JAVA : Bahasa pemrograman OOP ( Object Oriented Programming )
* setiap clcass yang dibuat didalam file java mewakili suatu object
*
*/

public class Basic {
    // Method MAIN : blok kode yang akan mengeksekusi suatu perintah
    public static void main(String[] args) {
        // Variabel : buat wadah penyimpanan data
        // Tipe data : jenis data yang disimpan didalam variabel
        /* Cara buat variabel :
        * <tipe data> <nama variable> = isi data */
        String name = "Zain"; // String
        int age = 22; // Integer
        boolean isStudent = false; //Boolean

        // System.out.println : buat nampilin output ke terminal
        System.out.println("Nama aku " + name + " umurku " + age + " dan status siswaku " + isStudent);

        // Array dijava punya ukuran data yang statis, gabisa sembarangan ubah(tambah datanya)
        System.out.println("=== ARRAY ===");

        // Int[] : tipe data manggil array
        int[] numbers = {1,2,3,4,5};
        System.out.println("Array length : " + numbers.length);
        numbers[3] = 8;
        // Looping tradisional
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Array ke - " + i);
        }

        // Integer : tipe data yang bisa dimanipulasi pake method-method array
        Integer integerNumber =  25;
        System.out.println("Integer : " + integerNumber);

        // Object : tipe data campuran
        Object[] dataCampuran = {"Zain", 22};
        // Enhanced looping
        for (Object i : dataCampuran) {
            System.out.println("dataCampuran : " + i);
        }

        // Tipe data angka yang ukuran/kapasitasnya lebih gede dibanding int
        long longNumber = 123;
        System.out.println(longNumber);
        // Tipe data untuk nilai pecahan
        double doubleNumber = 10.2;
        float floatNumber = 10;

        // Concatenation : method untuk gabungain 2 string
        String firstName = "Danu";
        String lastName = "Dina";
        System.out.println("Basic : " + firstName + " " + lastName);
        System.out.println("Concat : " + firstName.concat(lastName));

        // ENUM : Buat nyimpen nilai-nilai konstan yang gabisa diubah
        enum Grade {
            LULUS,
            TIDAK_LULUS
        }
        System.out.println("Status Kelulusan anda : " + Grade.TIDAK_LULUS);
    }
}
