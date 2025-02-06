package day2.OOP.User;


// Ini adalah child class implementasi dari inheritance
// Child class Admin inherit from parent class User
public class Admin extends User{
    private boolean isAdmin;

    public Admin(String username, boolean role){
        super(username); // Manggil variable milik class parent (User)
        isAdmin = role;
    }

    // Overwrite method si parent
    @Override
    public void displayInfo(){
        System.out.println("Admin username : " + getUsername());
        System.out.println(" Is Admin : " + isAdmin);
    }
}
