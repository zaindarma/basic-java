package day2.BasicOOP.AccessModifier;

public class Main {
    public static void main(String[] args) {
        // Panggil class didalam objek baru
        Person person1 = new Person("Dimas", 30, "Depok");
        Person person2 = new Person("Maruf", 31, "Bekasi");
        Person person3 = new Person("Alwi", 32, "Tangsel");

        // Panggil methodnya
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        Person.displayTotalPerson();

        // Akses datanya
        System.out.println("Public access : " + person1.name);
        // System.out.println("Private access : " + person1.age); // Error karena accessnya private
        System.out.println("Protected access : " + person1.address);
        System.out.println("Final access : " + person1.NATIONALITY);

        // Kapan harus implementasi access modifier?
        /* Public : biasa dipake untuk class atau method2 yang biasanya bisa dipanggil dimana aja
        * Private : biasa dipake untuk mendeklarasikan variabel class dimana gabisa sembarangan diubah
        * Final : ketika kita mau definisiin nilai default yang konstant untuk suatu variable */
    }
}
