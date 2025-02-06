package day2.Upcasting;

public class User {
    void login(){
        System.out.println("Login success!");
    }
}

// Subclass
class Admin extends User {
    // Void : method yang ga punya return
    void adminStatus(){
        System.out.println("Hi, admin");
    }
}

// Subclass
class Guest extends User {
    void guestStatus(){
        System.out.println("Hi, guest");
    }
}
