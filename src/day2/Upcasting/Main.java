package day2.Upcasting;

/* Upcasting : ngubah subclass jadi superclass */
public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        User user1 = admin; // Upcasting Admin ke User

        user1.login(); // Manggil method dari superclass
        // user1.adminStatus(); // Error, karena efek upcasting
    }
}
