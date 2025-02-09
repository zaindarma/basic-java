package day3.ExceptionHandling;

import java.util.Objects;

/* EXCEPTION HANDLING : error handling ketika ada operasi yang gagal
* macam-macam error handling :
* - IllegalArgumentException : error handling untuk argumen/parameter yang dikirim/terima
* - ArrayIndexOutOfBoundsException : error handling data array
* - IOException : untuk operasi file
* - ArithmeticException : untuk operasi matermatika
* - ResourceNotFoundException : untuk resource (404 Not Found)
* - BadRequestException : untuk (400 Bad Request)
* - UnauthorizedException : unauthorized (401 unauthorized)
* - ForbiddenException : untuk akses otorisasi (403 Forbidden)
* - InternalServerException : error internal server (500 internal server error)
* - Error : error handling universal */

public class Main {
    static void checkRole (String role) {
        // Equals buat ngecek data yang dikirim dari parameter
        if (Objects.equals(role, "user")){
            // Respon error manual
            throw new IllegalArgumentException ("Access Denied! only admin can access!");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        try {
            // Panggil method
            checkRole("user");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
