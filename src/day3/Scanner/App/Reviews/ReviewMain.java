package day3.Scanner.App.Reviews;

import java.util.Scanner;

public class ReviewMain {
    public static void main(String[] args) {
        Review.ReviewController reviewController = new Review.ReviewController();

        Scanner input = new Scanner(System.in);
        System.out.println("=== REVIEW ===");
        reviewController.displayAllReviews();
        System.out.println("==============");

        System.out.println("Apakah anda ingin menambahkan ulasan? (y/n) : ");
        String addReviewChoice = input.nextLine().toLowerCase();

        if (addReviewChoice.equals("y")) {
            System.out.println("Masukkan ulasan : ");
            String ulasan = input.nextLine();
            System.out.println("Rating : ");
            int rating = input.nextInt();
            input.nextLine();

            Review review = new Review(ulasan, rating);
            reviewController.addReview(review);
        } else {
            System.out.println("Terima kasih");
        }

        System.out.println("=== REVIEW ===");
        reviewController.displayAllReviews();
        System.out.println("==============");
    }
}
