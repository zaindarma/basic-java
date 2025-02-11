package day5;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.sql.*;
import java.util.Scanner;

public class Customer {
    String url = "jdbc:postgresql://localhost:5432/weekTest";
    String username = "postgres";
    String password = "root";
    Scanner input = new Scanner(System.in);

    public void getData() {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");

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
        System.out.println("Masukkan nama customer : ");
        String name = input.nextLine();

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO customers (customer_name) values (?)");
            preparedStatement.setString(1, name);

            preparedStatement.executeUpdate();
            System.out.println("Data berhasil ditambahkan!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editData(){
        System.out.println("Masukkan id customer : ");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Masukkan nama customer : ");
        String name = input.nextLine();
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE customers set customer_name = ? where id = ?");
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);

            int rowsUpdated = preparedStatement.executeUpdate();

            // Kondisi untuk ngecek apa ada data yang diupdate
            if (rowsUpdated > 0){
                System.out.println("Data berhasil diupdate!");
            } else {
                System.out.println("Data dengan id = " + id + " tidak ditemukan");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteData(){
        System.out.println("Masukkan id customer : ");
        int id = input.nextInt();
        input.nextLine();

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement preparedStatement = connection.prepareStatement("delete from customers where id = ?");
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
