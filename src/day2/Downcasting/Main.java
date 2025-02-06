package day2.Downcasting;

/* Downcasting : ngubah superclass/parent jadi subclass/child class
* biar bisa make method/atribut yang spesifik dari subclass */

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin(); // Bikin objek admin
        Guest guest = new Guest();
        User user1 = admin; // Bikin objek user
        User user2 = guest;

        Admin admin1 = (Admin) user1; // Downcasting User ke Admin
        admin1.adminStatus(); // Method yang ingin dipake superclass
        admin1.login(); // Method yang masih bisa dipake superclass walaupun udah di downcast

        Guest guest1 = (Guest) user2;
        guest1.guestStatus();
    }
}
