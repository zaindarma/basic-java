package day1.Method;

// Method override
// Class parent
public class Animal {
    public static String sound(){return "kiw kiw";}
}

// Class children yang mewarisi sifat/method2 parent
class Cat extends Animal {
    public static String sound(){return "Miaw miaw";}
}

class Dog extends Animal {
    public static String sound(){return "Guk guk";}
}