package day1.DataCollections.Map;

import java.util.HashMap;

/* Hashmap : implementasi dari interfacfe Map, buat nyimpen data objek dalam bentuk key-value
* Hashmap kaya representasi data object kalo di JavaScript */
public class HashMapExample {
    public static void main(String[] args) {
        // HashMap
        HashMap<String, String> daftarNama = new HashMap<>();

        // Nambahin data ke hashMap
        daftarNama.put("Nama", "Zain");
        daftarNama.put("Umur", "22");
        daftarNama.put("Job", "Student");

        // Cara akses data didalam hashMap
        System.out.println("Nama: " + daftarNama.get("Nama"));
        System.out.println("Umur: " + daftarNama.get("Umur"));
        System.out.println("Job: " + daftarNama.get("Job"));

        // Ngecek ukuran data
        System.out.println("Jumlah data : " + daftarNama.size());

        // Ngecek hashMap kosong
        System.out.println("hashMap kosong : " + daftarNama.isEmpty());

        // Nampilin semua key didalam hashMap
        for ( String key : daftarNama.keySet()){
            System.out.println("Key : " + key);
        }

        // Nampilin semua isi data dalam key hashMap
        for ( String value : daftarNama.values()){
            System.out.println("Data : " + value);
        }

        // Nampilin semua key dan data di hashMap
        for ( String key : daftarNama.keySet()){
            System.out.println(key + " : " + daftarNama.get(key));
        }

        // Cara ngubah data di hashMap
        daftarNama.put("Nama", "Zain");

        // cara ngapus data berdasarkan key
        daftarNama.remove("umur");

    }
}
