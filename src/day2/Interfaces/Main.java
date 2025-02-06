package day2.Interfaces;

public class Main {
    public static void main(String[] args) {
        UserController akun1 = new UserController("Zain", "123");

        System.out.println("Username : " + akun1.getUsername());
        System.out.println("Password : " + akun1.getPassword());
        akun1.addUser("Ridho", "123");

        System.out.println("Total users : " + akun1.getAllUser());
        // Default method
        akun1.getCompany();

        // Memanggil static method tanpa menggunakan class
        User.setName("Ridho Syawali");

        // Manggil method dari Role
        akun1.admin(true);
    }
}
