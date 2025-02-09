package day3.ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        int[] numbers = {1,2,3};

        try {
            // Cek nilai di indeks ke-3
            int checkNumber = numbers[3];
            System.out.println("Nilai yang diakses : " + checkNumber);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Error handling jika gagal
            System.out.println("Indeks array tidak valdi");
            System.out.println("Error message : " + e.getMessage());
        }
    }
}
