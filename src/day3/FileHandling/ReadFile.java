package day3.FileHandling;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        // Gunakan absolute path (Path lengkap) untuk akses file
        String filePath = "C:\\Users\\Zain Darma\\IdeaProjects\\basic-java\\src\\day3\\FileHandling\\testWriteFile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
            for (String line; (line = reader.readLine()) != null;) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
