package day1.DataCollections.List;

import java.util.ArrayList;

/* ARRAY LIST : implementasi dari interface List yang fungsinya buat nyimpen data berbentuk array
* ArrayList biasanya dipake buat nyimpen data komplek seperti objek
* Kelebihan array list dibanding array biasa adalah kemudahan unutk menipulasi datanya */
public class ArrayListExample {
    public static void main(String[] args) {
        // Array biasa
        int[] arrayBiasa = new int[5];
        arrayBiasa[0] = 10;
        arrayBiasa[1] = 20;

        // Array list
        ArrayList<String> daftarNama = new ArrayList<>();

        // Cara nambahin data/elemen ke dalam arrayList
        daftarNama.add("Zain");
        daftarNama.add("Zein");
        daftarNama.add("Zuin");

        // Cara nambahin elemen di indeks tertentu
        daftarNama.add(3, "Zoin");

        System.out.println("Data : " + daftarNama.get(0));

        // Ngubah elemen
        daftarNama.set(3, "Zaan");

        // Ngapus elemen
        daftarNama.remove(2);

        // Ngitung jumlah elemen
        System.out.println("Jumlah data : " + daftarNama.size());

        // Ngecek apakah arrayList kosong
        System.out.println("Apakah array list kosong? " + daftarNama.isEmpty());

        // Ngecek apakah elemen tertentu ada didalam arrayList
        System.out.println("Nama 'Zain' ada dalam daftar" + daftarNama.contains("Zain"));

        // Ngambil indeks elemen tertentu
        System.out.println("Indeks 'Zain' : " + daftarNama.indexOf("Zain"));

        // Nampilin semua elemen dalam arrayList
        System.out.println("Daftar nama : " + daftarNama);

        // Nampilin semua data pake looping
        for(String nama : daftarNama){
            System.out.println(nama);
        }

        // Buat arrayList dengan tipe data yang berbeda
        ArrayList<Object> dataRandom = new ArrayList<>();
        dataRandom.add("Zain");
        dataRandom.add(20);
        dataRandom.add(true);
        dataRandom.add(3.5);
        // Nampilin data collection di terminal
        System.out.println(dataRandom);

        // Buat nampilin data di setiap dataCollection
        for (Object data : dataRandom){
            System.out.println(data);
        }
    }
}
