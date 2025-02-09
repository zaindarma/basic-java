package day3.Scanner.App.Products;

import com.sun.security.jgss.AuthorizationDataEntry;

import java.util.Scanner;
import java.io.*;

public class ProductsMain {
    public static void main(String[] args) {
        Products.ProductController productController = new Products.ProductController();

        Scanner input = new Scanner(System.in);
        System.out.println("=== PRODUCT LIST ===");
        productController.displayAllProducts();
        System.out.println("====================");

        System.out.println("Apakah anda ingin menambahkan produk baru? (y/n) : ");
        String addProductChoice = input.nextLine().toLowerCase();

        if (addProductChoice.equals("y")){
            System.out.println("Masukkan jumlah produk : ");
            int jumlahProduk = input.nextInt();
            input.nextLine();

            for (int i = 0; i < jumlahProduk; i++) {
                System.out.println("Data data produk ke - " + (i + 1));
                System.out.println("Nama : ");
                String nama = input.nextLine();
                System.out.println("Harga : ");
                double harga = input.nextInt();
                input.nextLine();
                System.out.println("Kategori : ");
                String kategori = input.nextLine();

                Products products = new Products(nama, harga, kategori);
                productController.addProduct(products);
            }
        }

        System.out.println("=== PRODUCT LIST ===");
        productController.displayAllProducts();
        System.out.println("====================");

        // Sort Product by Price/Name
        System.out.println("Ingin mencari barang berdasarkan apa? (Harga/Nama) : ");
        String sortProduct = input.nextLine().toLowerCase();
        if (sortProduct.equals("harga")) {
            System.out.println("Masukkan harga produk : ");
            double productPrice = input.nextInt();
            input.nextLine();
            System.out.println("=== SORT BY PRICE ===");
            productController.searchProductByPrice(productPrice);
            System.out.println("=====================");
        } else if (sortProduct.equals("nama")) {
            System.out.println("Masukkan nama produk : ");
            String productName = input.nextLine();
            System.out.println("=== SORT BY NAME ===");
            productController.searchProductByName(productName);
            System.out.println("=====================");
        } else {
            System.out.println("Input Harga/Nama tidak valdi!");
        }

        // Save product list ke file
        System.out.println("Ingin menyimpan data product ke dalam file? (Y/N)");
        String saveProduct = input.nextLine().toLowerCase();
        if (saveProduct.equals("y")) {
            productController.saveProduct();
        } else {
            System.out.println("Data tidak disimpan");
        }

        // Read list file product
        System.out.println("Ingin membaca data product dari file? (Y/N)");
        String readProduct = input.nextLine().toLowerCase();
        if (readProduct.equals("y")) {
            productController.readProduct();
        } else {
            System.out.println("Data Gajadi dibaca");
        }
    }
}
