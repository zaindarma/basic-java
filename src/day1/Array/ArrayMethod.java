package day1.Array;

import jdk.jshell.EvalException;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        System.out.println("=== ARRAY BIASA ===");
        int[] numbers = {1,2,3,4,5};
        System.out.println("Array length : " + numbers.length);
        numbers[4] = 7; // Buat ganti indeks ke empat jadi 7

        System.out.println("=== ARRAY METHOD ===");
        System.out.println("=== SORT ===");
        Integer sortArray[] = {2,4,7,3,5,6,1};
        // Method array untuk ngurutin data ASC
        Arrays.sort(sortArray);
        System.out.println(Arrays.toString(sortArray));
        for (int i : sortArray) {
            System.out.println("sorted array : " + i);
        }

        System.out.println("=== FILL ===");
        // Method fill : method untuk mengisi semua indeks array dengan nilai yang sama
        int[] fillNumbers = new int[5];
        Arrays.fill(fillNumbers, 7); // Buat ngisi semua data jadi 7
        for (int i : fillNumbers) {
            System.out.println("Fill : " + i);
        }

        System.out.println("=== COPY OF ARRAY ===");
        // Method buat nyalin array lain
        int[] copyNumbers = Arrays.copyOf(numbers, numbers.length);
        for (int i : copyNumbers){
            System.out.println("Copy Numbers : " + i);
        }

        int[] newNumbers = Arrays.copyOf(numbers, numbers.length + 1);
        newNumbers[5] = 50;
        for (int i : newNumbers){
            System.out.println("Copy newNumbers : " + i);
        }

        // copyOfRange array : menyalin array dari range tertentu
        System.out.println("=== COPY OF RANGE ARRAY ===");
        int[] rangeNumbers = Arrays.copyOfRange(numbers, 1, 4); // Menyalin data array yang dimulai dari index
        for (int i : rangeNumbers) {
            System.out.println("copyOfRange numbers: " + i);
        }

        // equals array : menyamakan 2 data array
        System.out.println("=== EQUALS ARRAY ===");
        int[] equalNumber1 = {1,2,3,4,5};
        int[] equalNumber2 = {1,2,3,4,5};
        boolean isEqual = Arrays.equals(equalNumber1, equalNumber2);
        System.out.println("is equal : " + isEqual);

        int search = 4;
        for (int i : equalNumber1){
            if (equalNumber1[i] == search){
                System.out.println("Value 4 exist");
                System.out.println("Current Value : " + equalNumber1[i]);
                break; // Buat ngeberhentiin proses looping ketika kondisi terpenuhi
            }
        }

        System.out.println("=== Convert to string ===");
        String arrayToString = Arrays.toString(newNumbers);
        System.out.println("Array to string " + arrayToString);
    }
}
