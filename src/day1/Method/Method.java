package day1.Method;

// Cara import method instance
import static day1.Method.MultipleMethod.multiple;
import static day1.Method.Animal.*;

public class Method {
    // Method : fungsi untuk menjalanin suatu perintah/perilaku tertentu (FUNGSI)

    /* public static int add(int num1, int mum2){} cara buat method
    * public static : access modifier agar method ini bisa digunakan secara global
    * int add(params) : method/fungsi dengan return integer
    * return : buat ngembaliin nilai */
    public static int add(int num1, int num2){return num1 + num2;}
    public static int cekNilai(int nilai){
        if(nilai >= 80){
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
        return nilai;
    }



    public static void main(String[] args) {
        // Cara jalanin method
        int result = add(5, 2);
        System.out.println("Sum : " + result);

        cekNilai(50);

        // Multiple
        System.out.println("=== METHOD OVERLOAD ===");
        System.out.println("Multiple (2) : " + multiple(2, 3));
        System.out.println("Multiple (3) : " + multiple(2, 5, 4));
        System.out.println("Multiple (Double) : " + multiple(2.3, 5.4, 6.6));

        // Sound
        System.out.println("=== METHOD OVERRIDE ===");
        System.out.println(sound()); // Parent yang return asli
        System.out.println(Cat.sound()); // Child yang mereplace method parent
        System.out.println(Dog.sound());

        // Cara manggil instance method
        System.out.println("=== INSTANCE METHOD ===");
        Animal hewan = new Animal();
        System.out.println(hewan.sound());

        Cat kocheng = new Cat();
        System.out.println(kocheng.sound());

        Dog anjhing = new Dog();
        System.out.println(anjhing.sound());
    }
}
