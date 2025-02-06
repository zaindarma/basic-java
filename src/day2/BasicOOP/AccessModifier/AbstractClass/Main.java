package day2.BasicOOP.AccessModifier.AbstractClass;

public class Main {
    public static void main(String[] args) {
        // Bikin objek dari turunan class Hewan
        Kucing kucingOyen = new Kucing("Nguyen", 2);

        // Akses method
        kucingOyen.makan();
        kucingOyen.tidur();

        // Akses getter
        System.out.println("Nama Kucingggg : " + kucingOyen.getName());
        System.out.println("Umur Kucingggg : " + kucingOyen.getUmur());
    }
}
