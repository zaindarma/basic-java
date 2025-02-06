package day2.OOP.Test;

public class Students {
    public String nama;
    public int nim;
    public int nilai;

    public Students(String namaSiswa, int nimSiswa, int nilaiSiswa){
        nama = namaSiswa;
        nim = nimSiswa;
        nilai = nilaiSiswa;
    }

    public void displayStudent(){
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Nilai : " + nilai);
    }
}
