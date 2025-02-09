package day3.Scanner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Import scanner dari java buat bikin inputan ke terminal
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama : ");
        String nama = input.nextLine();
        System.out.println("Umur : ");
        int age = input.nextInt();
        input.nextLine(); // Bikin karakter \n setelah membaca inputan angka
        System.out.println("Kelas : ");
        String kelas = input.nextLine();

        System.out.println("Halo, " + nama + " umur " + age + " tahun" + " kelas " + kelas);

        // Buat nutup inputan
        input.close();
    }
}
