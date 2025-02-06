package day2;

import day2.OOP.Blogs.Blog;
import day2.OOP.Student.Student;
import day2.OOP.User.Admin;
import day2.OOP.User.User;

public class Main {
    public static void main(String[] args) {
        // Class biasa
        System.out.println("=== GET STUDENT ===");
        Student s1 = new Student("Imron", 70);
        s1.cekStatus();

        Student s2 = new Student("Danu", 90);
        s2.name = "Danu";
        s2.score = 90;
        s2.cekStatus();

        // Class enkapsulasi
        System.out.println("=== GET BLOGS ===");
        Blog myBlog = new Blog("Bootcamp Aigem Batch 3", "Open Registration");
        myBlog.displayInfo();
        myBlog.getTitle(); // Buat nampilin title
        myBlog.setContent("Registration Closed"); // Buat set/update data title
        myBlog.displayInfo();

        // Comment
        myBlog.addComment("Imron", "Masih buka ga bang?");
        myBlog.addComment("Ridho", "Bayar berapa bang?");
        myBlog.displayComments();

        // Inheritance
        System.out.println("=== GET USERS ===");
        // Class parent
        User userGuest = new User("Imron");
        userGuest.displayInfo();

        // Class child
        Admin userAdmin = new Admin("Ridho", true);
        userAdmin.displayInfo();
    }
}
