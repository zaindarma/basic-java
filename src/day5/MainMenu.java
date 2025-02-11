package day5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.sql.*;
import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product productCRUD = new Product();
        Customer customerCRUD = new Customer();

        // Menu
        while(true){
            System.out.println("=====HOME=====");
            System.out.println("1. Menu Produk");
            System.out.println("2. Menu Customer");
            System.out.println("0. Exit");
            System.out.println("==============");
            System.out.print("Pilih menu : ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu){
                case 1:
                    while (true){
                        System.out.println("=====MENU PRODUK=====");
                        System.out.println("1. Tambah Produk");
                        System.out.println("2. Update Produk");
                        System.out.println("3. Hapus Produk");
                        System.out.println("4. Lihat Produk");
                        System.out.println("0. Exit");
                        System.out.println("==============");
                        System.out.print("Pilih menu : ");
                        int menuProduk = input.nextInt();
                        input.nextLine();

                        switch (menuProduk){
                            case 1:
                                System.out.println("=====ADD PRODUCT======");
                                productCRUD.addData();
                                System.out.println("======================");
                                break;
                            case 2:
                                System.out.println("=====UPDATE PRODUCT======");
                                productCRUD.editData();
                                System.out.println("======================");
                                break;
                            case 3:
                                System.out.println("=====DELETE PRODUCT======");
                                productCRUD.deleteData();
                                System.out.println("======================");
                                break;
                            case 4:
                                System.out.println("=====READ PRODUCT======");
                                productCRUD.getData();
                                System.out.println("======================");
                                break;
                            case 0:
                                System.out.println("Kembali ke menu awal...");
                                break;
                            default:
                                System.out.println("input tidak valid");
                                break;
                        }
                        if(menuProduk == 0) break;
                    }
                    break;
                case 2:
                    while (true){
                        System.out.println("=====MENU CUTOMER=====");
                        System.out.println("1. Tambah Customer");
                        System.out.println("2. Update Customer");
                        System.out.println("3. Hapus Customer");
                        System.out.println("4. Lihat Customer");
                        System.out.println("0. Exit");
                        System.out.println("==============");
                        System.out.print("Pilih menu : ");
                        int menuCustomer = input.nextInt();
                        input.nextLine();

                        switch (menuCustomer){
                            case 1:
                                System.out.println("=====ADD CUSTOMER======");
                                customerCRUD.addData();
                                System.out.println("======================");
                                break;
                            case 2:
                                System.out.println("=====UPDATE CUSTOMER======");
                                customerCRUD.editData();
                                System.out.println("======================");
                                break;
                            case 3:
                                System.out.println("=====DELETE CUSTOMER======");
                                customerCRUD.deleteData();
                                System.out.println("======================");
                                break;
                            case 4:
                                System.out.println("=====VIEW DATA CUSTOMER======");
                                customerCRUD.getData();
                                System.out.println("======================");
                                break;
                            case 0:
                                System.out.println("Kembali ke menu awal...");
                                break;
                            default:
                                System.out.println("input tidak valid");
                                break;
                        }
                        if(menuCustomer == 0) break;
                    }
                    break;
                case 0:
                    System.out.println("Terimakasih, sampai jumpa!");
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Menu yang anda pilih tidak tersedia");
                    break;
            }
        }
    }
}