package day2.BasicOOP.AccessModifier.AbstractClass;

/* ABSTRACT CLASS : class yang gabisa dibuat instance creation secara langsung
* atau gabisa dibuat objek secara langsung, cuma bisa dipake buat class, subclassnya, dan turunannya */

public abstract class Hewan {
    public String name;
    public int umur;

    public Hewan(String name, int umur) {
        this.name = name;
        this.umur = umur;
    }

    /* Abstract method : method yang harus diimplementasikan oleh class turunannya
    * kalo gak di implementasi, maka class turunannya juga bakal jadi abstract
    * dan gabisa dibuat objek secara langsung */
    public abstract void makan();

    // Method biasa
    public void tidur() {
        System.out.println(name + " gi tidur");
    }

    // Getter/Setter (Getter buat ngambil data, Setter buat ngeset data)
    public String getName() {
        return name;
    }

    public int getUmur() {
        return umur;
    }
}