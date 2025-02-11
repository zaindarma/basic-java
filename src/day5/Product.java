package day5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.sql.*;
import java.util.Scanner;

public class Product {
    String url = "jdbc:postgresql://localhost:5432/weekTest";
    String username = "postgres";
    String password = "root";
    Scanner input = new Scanner(System.in);

    public boolean isValidCategoryId(int categoryId) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM categories WHERE id = ?");
            preparedStatement.setInt(1, categoryId);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getData() {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM products");

            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            ObjectMapper mapper = new ObjectMapper();

            ArrayNode arrNode = mapper.createArrayNode();

            while(resultSet.next()){
                ObjectNode objNode = mapper.createObjectNode();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    objNode.put(columnName, resultSet.getString(i));
                }
                arrNode.add(objNode);
            }

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

        System.out.println("Masukkan kategori produk : ");
        int categories = input.nextInt();
        if (!isValidCategoryId(categories)) {
            System.out.println("Category id tidak tersedia");
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO products (product_name, product_price, categories_id) values (?,?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.setInt(3, categories);

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
        int categories = input.nextInt();
        if (!isValidCategoryId(categories)) {
            System.out.println("Category id tidak tersedia");
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE products set product_name = ?, product_price = ?, categories_id = ? where id = ?");
            preparedStatement.setString(1, name);
            preparedStatement.setDouble(2, price);
            preparedStatement.setInt(3, categories);
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
}
