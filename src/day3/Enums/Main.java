package day3.Enums;

public class Main {
    public static void main(String[] args) {
        // Panggil enum
        EnumDay today = EnumDay.FRIDAY;

        switch (today) {
            case SUNDAY :
                System.out.println("Today is Sunday");
                break;
            case MONDAY :
                System.out.println("Today is Monday");
                break;
            case TUESDAY :
                System.out.println("Today is Tuesday");
                break;
            case FRIDAY :
                System.out.println("Today is Friday");
                break;
            default :
                System.out.println("Day is not valdi");
        }

        // Enum class
        EnumLikeClass getToday = EnumLikeClass.MONDAY;
        System.out.println("Today is " + getToday + " and its a " + getToday.getType());
    }
}
