package day3.FileHandling;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Zain Darma\\IdeaProjects\\basic-java\\src\\day3\\FileHandling\\testWriteFile.txt";

        File file = new File(fileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Aku adalah lelaki, yang tak pernah lelah mencari lc");
            writer.newLine();
            writer.write("Tapi tak pernah lupa mengoding");

            System.out.println("=====================");
            System.out.println("File Berhasil Dibuat :) \n path : " + file.getAbsolutePath());
            System.out.println("=====================");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
