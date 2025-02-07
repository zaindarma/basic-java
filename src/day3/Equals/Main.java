package day3.Equals;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private List<User> listUser = new ArrayList<>();

    // Tambahin user is listUser
    public void registerUser(User user) {
        listUser.add(user);
    }

    // Validasi apakah user sudah terdaftar apa belum
    public void isUserRegistered(User user) {
        if(listUser.contains(user)) {
            System.out.println(user.getUsername() + " is registered");
        } else {
            System.out.println(user.getData() + " is not registered");
        }
    }

    public static void main(String[] args) {
        Main userController = new Main(); // Instance dari objek main

        // Tambah data User
        User user1 = new User("Zain", "zain@gmail.com");
        User user2 = new User("Zaun", "zaun@gmail.com");
        User user3 = new User("Ridho", "ridho@gmail.com");

        // Register user diatas
        userController.registerUser(user1);
        userController.registerUser(user2);
        // userController.registerUser(user3); // Simulasi user tidak terdaftar

        userController.isUserRegistered(user1);
        userController.isUserRegistered(user2);
        userController.isUserRegistered(user3); // Simulasi user tidak terdaftar
    }
}
