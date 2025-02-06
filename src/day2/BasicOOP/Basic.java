package day2.BasicOOP;
/* BASIC OOP
* CLass : Konsep dasar untuk bikin objek atau kerangka kerja yang mendefinisikan
* karakteristik dan perilaku suatu objek
* atau bisa dibilng class yang berisi fungsionalitas suatu program */
public class Basic { // Class penampung
    public static class Human { // Class static yang bisa dipanggil oleh class lainnya
        // Class attribute : data yang dimiliki objek
        String name;
        int age;

        // Constructor : method khusus yang menginisialisasikan objek/mengatur nilai awal dari variabel class
        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        // Methid : fungsi khusus yang dimiliki objek
        public void breath(){
            System.out.println(name + " Is Breathing. and he's " + age + " years old");
        }

        public void fart(){
            System.out.println(name + " is farting!");
        }
    }
}
