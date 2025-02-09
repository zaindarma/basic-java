package day3.Scanner.App.Reviews;

import day3.Scanner.App.Products.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Review {
    String name;
    int rating;

    public Review(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    // Inner Class
    public static class ReviewController {
        private List<Review> reviewList = new ArrayList<>();

        public ReviewController() {
            reviewList = new ArrayList<>();
        }

        // Method
        public void addReview(Review review){
            reviewList.add(review);
        }

        public void displayAllReviews(){
            if(!reviewList.isEmpty()){
                for (Review review : reviewList){
                    System.out.println("Reviewer : " + review.name + ", Rating : " + review.rating);
                }
            } else {
                System.out.println("Review tidak tersedia");
            }
        }
    }
}
