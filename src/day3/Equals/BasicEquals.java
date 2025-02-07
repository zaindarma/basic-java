package day3.Equals;

class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

/* EQUALS : Method buat bandingin 2 objek apakah mereka punya atribut dan isi yang sama
* ini sama kaya operator === di JS */

public class BasicEquals {
    public static void main(String[] args) {
        Car car1 = new Car("Hyundai Ionic 5", 2023);
        Car car2 = new Car("Toyota Supra X", 2025);
        Car car3 = car1; // Merefrensikan(Akses alamat) objek ke objek yang udah ada

        // Method equals default dari object
        System.out.println(car1.equals(car2)); // False
        System.out.println(car1.equals(car3)); // True

        System.out.println(car1 == car2); // False
        System.out.println(car1 == car3); // True

        if (car1.equals(car3)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        boolean status = car1 == car3;
        System.out.println(status);
    }
}
