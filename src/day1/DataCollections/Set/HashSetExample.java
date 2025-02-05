package day1.DataCollections.Set;

import java.util.HashSet;

/* HashSet : implementasi dari interface set buat nyimpen data-data yang unik (tidak boleh duplikat)
* dalam bentuk himpunan atau set */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> himpunanNama = new HashSet<>();

        himpunanNama.add("Zain");
        himpunanNama.add("Zaan");
        himpunanNama.add("Zain"); // Ini ga bakal ditambahin lagi karena udah ada

        System.out.println("set nama : " + himpunanNama);
    }
}
