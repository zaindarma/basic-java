package day1.MathMethod;

public class MathMethod {
    public static void main(String[] args) {
        float phi = (float) Math.PI;
        System.out.println("Math PI: " + phi);

        double floorValue = Math.floor(3.8); // Bulat kebawah
        System.out.println("Math Floor: " + floorValue);

        double ceilValue = Math.ceil(3.2); // Bulat keatas
        System.out.println("Math Ceil: " + ceilValue);

        double roundValue = Math.round(3.4); // Bulatin terdekat
        System.out.println("Math Round: " + roundValue);

        double squareValue = Math.sqrt(64); // Ngitung akar
        System.out.println("Math sqrt: " + squareValue);

        double powerOfTwo = Math.pow(4,2); // Ngitung Pangkat
        System.out.println("Math pow: " + powerOfTwo);

        int min = Math.min(10,5); // Nyari nilai terkecil
        System.out.println("Math min: " + min);

        int max = Math.max(10,5); // Nyari nilai terbesar
        System.out.println("Math max: " + max);

        double randomValue = Math.random(); // Generate nilai random
        System.out.println("Math random: " + randomValue);
    }

}

