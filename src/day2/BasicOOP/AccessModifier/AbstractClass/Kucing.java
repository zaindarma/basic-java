package day2.BasicOOP.AccessModifier.AbstractClass;

public class Kucing extends Hewan {
    // Kata kunci super buat make variable yang dimliki parent
    public Kucing(String name, int umur) {
        super(name, umur);
    }

    @Override
    public void makan() {
        System.out.println(name + " sedang makan whiskas!");
    }
}
