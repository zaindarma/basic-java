package day3.Scanner.App.Products;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class Products {
    public String name;
    public double price;
    public String category;

    public Products(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Inner class
    public static class ProductController{
        private final List<Products> productList;

        public ProductController(){
            productList = new ArrayList<>();
        }

        // Method
        public void addProduct(Products product){
            productList.add(product);
        }

        public void displayAllProducts(){
            if(!productList.isEmpty()){
                for (Products product : productList){
                    System.out.println("Nama : " + product.name + ", Price : " + product.price + ", Category : " + product.category);
                }
            } else {
                System.out.println("Produk tidak tersedia");
            }
        }

        public void searchProductByPrice(double sortPrice){
            if(!productList.isEmpty()){
                for (Products product : productList){
                    if(product.price == sortPrice){
                        System.out.println("Nama : " + product.name + ", Price : " + product.price);
                    }
                }
            } else {
                System.out.println("Produk tidak tersedia");
            }
        }

        public void searchProductByName(String sortName){
            if(!productList.isEmpty()){
                for (Products product : productList){
                    if(product.name.equals(sortName)){
                        System.out.println("Nama : " + product.name + ", Price : " + product.price);
                    }
                }
            } else {
                System.out.println("Produk tidak tersedia");
            }
        }

        public void saveProduct() {
            String fileName = "C:\\Users\\Zain Darma\\IdeaProjects\\basic-java\\src\\day3\\Scanner\\App\\Products\\dataProduct.txt";
            File file = new File(fileName);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (Products product : productList) {
                    writer.write((productList.indexOf(product) + 1) + ". " + product.name + ", " + product.price + ", " + product.category + "\n");
                }
                System.out.println("File Berhasil disimpan");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void readProduct() {
            String fileName = "C:\\Users\\Zain Darma\\IdeaProjects\\basic-java\\src\\day3\\Scanner\\App\\Products\\dataProduct.txt";
            File file = new File(fileName);

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String productData;
                int productNumber = 1;
                while ((productData = reader.readLine()) != null) {
                    System.out.println("Data Produk " + productNumber + " :");
                    System.out.println(productData);
                    productNumber++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


// Semua method dibikin di class Products