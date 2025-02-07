package day3.InnerClass;

// INNER CLASS : class dalam class, inner class bisa ngakses atribut dan method dari outer class
// Implementasi inner class bisa dipake ketika kita mau bikin stuktur data objek didalam objek
// atau untuk grouping antara atribut dan fungsionalitas
public class OuterClass {
    private String outerVar = "10";

    public class InnerClass {
        public void display(){
            System.out.println("Outer var = " + outerVar);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}

/* VISUAL
const outer = {
                outerVar = "10";
                innerClass = {
                                inner = outerVar;
                             }
               }
*/