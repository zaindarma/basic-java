package day2.OOP.Blogs;

/* ENKAPSULASI : cara untuk membatasi dan melindungi data/method dari access langsung
* untuk meningkatkan keamanan dari perubahan data yang tidak disengaja */

import java.util.ArrayList;
import java.util.List;

public class Blog {
    // Enkansuplasi terjadi disini
    private String title;
    private String content;
    /* List : Interface yang nandain bahwa variabel ini adlaah sebuah list/daftar/array
    * kenapa List? karena biar bisa pake arrayList */
    private List<Comment> comments;

    public Blog(String blogTitle, String blogContent) {
        title = blogTitle;
        content = blogContent;
        comments = new ArrayList<>();
    }

    // Getter Blog
    public String getTitle() {
        return title;
    }
    public void setTitle(String newTitle){
        title = newTitle;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String newContent) {
        content = newContent;
    }

    // Method blog
    public void displayInfo() {
        System.out.println("Title : " + title);
        System.out.println("Content : " + content);
    }

    // Inner Class : class didalam class, objek didalam objek
    public class Comment {
        private String author;
        private String text;

        public Comment(String nameAuthor, String descText) {
            author = nameAuthor;
            text = descText;
        }

        // Getter
        public String getAuthor() {
            return author;
        }
        public String getText() {
            return text;
        }
    }

    public void addComment(String author, String text) {
        Comment newComment = new Comment(author, text);
        comments.add(newComment);
    }

    public void displayComments() {
        System.out.println("Comment : ");
        for (Comment comment : comments) {
            System.out.println("Author : " + comment.getAuthor());
            System.out.println("Text : " + comment.getText());
        }
    }
}
