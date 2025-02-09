package day3.Scanner.App.Home;

import day3.Scanner.App.Products.ProductsMain;

import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("- Login");
        System.out.println("- Register");
        System.out.println("- Product");
        System.out.println("- Cart");
        System.out.println("- Review");
        System.out.println("Pilih menu : ");
        // convert inputan ke huruf kapital
        Menu myMenu = Menu.valueOf(input.nextLine().toUpperCase());

        switch (myMenu){
            case LOGIN:
                System.out.println("Login success!");
                break;
            case REGISTER:
                System.out.println("Register success!");
                break;
            case PRODUCT:
                System.out.println("Navigate to Product Page");
                ProductsMain.main(args);
                break;
            case CART:
                System.out.println("Navigate to Cart Page");
                break;
            case REVIEW:
                System.out.println("Navigate to Review Page");
                // Buat menu review yang bisa nambahin reviewer dan rating(int), kemudian tampilin semua reviewnya
                break;
            default:
                System.out.println("HALAMAN TIDAK DITEMUKAN");
        }
    }
}
