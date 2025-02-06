package day2.BasicOOP.AccessModifier;

public class Person {
    // Access modifier : kata kunci untuk mengatur aksebilitas, visibilitas dari sebuah class, variable, atau method

    // Public
    public String name; // Bisa diakss dimana aja

    // Private
    private int age; // Cuma bisa diakses dalam kelas sendiir

    // Protected
    protected String address; // Cuma bisa diakses oleh Person dan Subclassnya

    // Non-access modifier : buat ngasih nilai awal
    // Static
    public static int totalPerson = 0; // Variabel statis untuk ngasih nilai awal terhadap variabel

    // Final
    public final String NATIONALITY = "Indonesian"; // Untuk bikin nilai constant

    // Constructor
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
        totalPerson++;
    }

    // Method
    public void displayInfo(){
        System.out.println("My name : " + name);
        System.out.println("My age : " + age);
        System.out.println("My address : " + address);
    }

    // Method static untuk nampilin total objek setiap kali objek person bertambah
    public static void displayTotalPerson(){
        System.out.println("Total person : " + totalPerson);
    }

}
