package day3.FileHandling;

import java.io.*;

public class EditFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Zain Darma\\IdeaProjects\\basic-java\\src\\day3\\FileHandling\\testWriteFile.txt";
        File file = new File(fileName);

        // Buat konten baru setelah pengeditan
        StringBuilder newContent = new StringBuilder();

        // Cek
        if (file.exists()) {
            // Baca dulu filenya
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                for (String line; (line = reader.readLine()) != null;) {
                    // Replace kata programmer jadi badut
                    line = line.replace("programmer", "badut");
                    newContent.append(line).append(System.lineSeparator());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Tulis konten yang di edit ke file yang sama
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                writer.write(newContent.toString());
                writer.append("1234567890").append(System.lineSeparator());
                System.out.println("File berhasil diedit :) \n path : " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File tidak ditemukan \n path : " + file.getAbsolutePath());
        }
    }

}
