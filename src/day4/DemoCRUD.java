package day4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.*;

import java.sql.*;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class DemoCRUD {
    // Connect to database (db)
    String url = "jdbc:postgresql://localhost:5432/bootcamp";
    String username = "postgres";
    String password = "root";
    Scanner input = new Scanner(System.in);

    public void getData() {
        try {
            // DriverManager.getConnection : buat ngehubungin ke database
            Connection connection = DriverManager.getConnection(url, username, password);
            // Panggil objek statement buat ngeksekusi query
            Statement statement = connection.createStatement();
            // Panggil ResultSet buat nampung hasil eksekusi query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM products");

            // Ambil nama kolom dan tipe data dari tiap kolom
            ResultSetMetaData metaData = resultSet.getMetaData();
            // Ambil jumlah kolom
            int columnCount = metaData.getColumnCount();

            // ObjectMepper : mapping data ke format JSON
            ObjectMapper mapper = new ObjectMapper(); // Bikin objek kosong

            // ArrayNode buat nampung data ke array of object (JSON)
            ArrayNode arrNode = mapper.createArrayNode();

            while(resultSet.next()){
                // Buat data object untuk setiap baris data
                ObjectNode objNode = mapper.createObjectNode();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    objNode.put(columnName, resultSet.getString(i));
                }
                // Masukin data objek yang udah dilooping ke array
                arrNode.add(objNode);
            }

            // Buat format data ke format JSON yang lebih rapih
            String jsonString=  mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrNode);
            System.out.println(jsonString);
        } catch (SQLException | com.fasterxml.jackson.core.JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public void addData(){
        System.out.println("Masukkan nama produk : ");
        String name = input.nextLine();

        System.out.println("Masukkan harga produk : ");
        double price = input.nextDouble();
        input.nextLine();

        System.out.println("Masukkan kategoru produk : ");
        String category = input.nextLine();

        try {
            // DriverManager.getConnection : buat ngehubungin ke database
            Connection connection = DriverManager.getConnection(url, username, password);
            // PreparedStatement untuk ngeksekusi query yang punya jumlah data banyak. (?,?,?) pada values buat cegah SQL Injextion
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO products (product_name, product_price, category) values (?,?,?)");
            preparedStatement.setString(1, name); // setString buat masukin data string
            preparedStatement.setDouble(2, price); // double buat masukin data double
            preparedStatement.setString(3, category);

            preparedStatement.executeUpdate();
            System.out.println("Data berhasil ditambahkan!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editData(){
        System.out.println("Masukkan id produk : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan nama produk : ");
        String name = input.nextLine();

        System.out.println("Masukkan harga produk : ");
        double price = input.nextDouble();
        input.nextLine();

        System.out.println("Masukkan kategori produk : ");
        String category = input.nextLine();

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE products set product_name = ?, product_price = ?, category = ? where id = ?");
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.setString(3, category);
            preparedStatement.setInt(4, id);

            int rowsUpdated = preparedStatement.executeUpdate();

            // Kondisi untuk ngecek apa ada data yang diupdate
            if (rowsUpdated > 0){
                System.out.println("Data berhasil diupdate!");
            } else {
                System.out.println("Data dengam id = " + id + " tidak ditemukan");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteData(){
        System.out.println("Masukkan id produk : ");
        int id = input.nextInt();
        input.nextLine();

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("delete from products where id = ?");
            preparedStatement.setInt(1, id);
            int productDeleted = preparedStatement.executeUpdate();

            // Kondisi untuk ngecek apa ada data yang diupdate
            if (productDeleted > 0){
                System.out.println("Data berhasil dihapus!");
            } else {
                System.out.println("Data dengam id = " + id + " tidak ditemukan");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void orderProduct(){
        System.out.println("Masukkan id produk : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan jumlah pembelian : ");
        int qty = input.nextInt();
        input.nextLine();

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO orders (product_id, order_date, quantity) values (?,?,?)");
            preparedStatement.setInt(1, id);
            preparedStatement.setDate(2, Date.valueOf(LocalDate.now()));
            preparedStatement.setInt(3, qty);

            int productOrder = preparedStatement.executeUpdate();

            if (productOrder > 0){
                System.out.println("Data berhasil diupdate!");
            } else {
                System.out.println("Data dengam id = " + id + " tidak ditemukan");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        DemoCRUD demo = new DemoCRUD();
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("==== MENU ====");
            System.out.println("1. View all products");
            System.out.println("2. Add new products");
            System.out.println("3. Edit products");
            System.out.println("4. Delete products");
            System.out.println("5. Order products");
            System.out.println("6. Exit");
            System.out.println("Pilih menu : ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu){
                case 1:
                    demo.getData();
                    break;
                case 2:
                    demo.addData();
                    break;
                case 3:
                    demo.editData();
                    break;
                case 4:
                    demo.deleteData();
                    break;
                case 5:
                    demo.orderProduct();
                    break;
                case 0:
                    System.out.println("Thankyou, have a good day!");
                    input.close();
                    return; // Buat ngeclose menu input
                default:
                    System.out.println("Input tidak valdi");
            }
        }
    }
}
