package day1.DataCollections.List;

import java.util.LinkedList;

/* Linked list : implementasi dari interface list yang punya fungsi sama kaya arrayList */
public class LinkedListExample {
    public static void main(String[] args) {
        // Linked list
        LinkedList<String> daftarNama = new LinkedList<>();

        // Cara nambahin data/elemen ke dalam arrayList
        daftarNama.add("Zain");
        daftarNama.add("Zein");
        daftarNama.add("Zuin");
        daftarNama.addFirst("Zena");
        daftarNama.add("Zeni");

        // Cara akses elemen di indeks tertentu
        System.out.println("Data : " + daftarNama.get(0));
        System.out.println("Data : " + daftarNama.getFirst());
        System.out.println("Data : " + daftarNama.getLast());

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
    }
}
