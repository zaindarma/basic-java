package day1.Casting;

public class Main {
    public static void main(String[] args) {
        int number = 123;

        String intToString = Integer.toString(number);
        // Konversi int ke string
        System.out.println("Number to string : " + intToString);

        // Konversi string int
        String numberString = "123";
        System.out.println("String to int : " + Integer.parseInt(numberString));

        // String to double
        String doubleString = "123.45";
        System.out.println("String to double int : " + Double.parseDouble(doubleString));

        // String to boolean
        String booleanString = "true";
        System.out.println("String to boolean : " + Boolean.parseBoolean(booleanString));

        // Int to double
        int intValue = 12;
        double doubleValue = intValue;
        System.out.println("Int to double : " + doubleValue);

        // Double to int
        int intValueFromDouble = (int) doubleValue;
        System.out.println("Double to int : " + intValueFromDouble);
    }
}
