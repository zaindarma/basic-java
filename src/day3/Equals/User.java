package day3.Equals;

public class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    // Methid equals juga bisa di override untuk bandingin 1 field atau beberapa field aja dalam objek
    public boolean equals(Object obj) {
        if (this == obj) return true; // Pertama cek jika objeknya sama
        // Cek apa objeknya null atau bukan instance/class User
        if (obj == null || getClass() != obj.getClass()) return false; // Cek apa objeknya null atau bukan instac
        User user = (User) obj; // Downcast objek ke User
        // Bandingkan username dan email
        return username.equals(user.username);
    }

    public String getData() {
        return "Username : " +  username + ", Email : " + email;
    }
    public String getUsername() {
        return username;
    }
}
