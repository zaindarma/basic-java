package day2.Interfaces;

/* Interface : Kumpulan method yang harus dipake oleh class yang mengimplementasikannya */

public interface User {
    // Method biasa yang wajib di pake oleh class yang mengimplementasikannya
    String getUsername();
    String getPassword();

    void addUser(String username, String password);
    int getAllUser();

    // Default method = method ini ga perlu di override(Opsional)
    default void getCompany(){
        System.out.println("Company : PT Aigen Global Teknologi");
    }

    // Static method = method yang bisa dipanggil langsung tanpa memerlukan class (Method ini gabisa di override)
    static void setName(String name){
        System.out.println("Nama : " + name);
    }
}
