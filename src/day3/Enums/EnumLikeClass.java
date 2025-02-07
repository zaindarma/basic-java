package day3.Enums;

/* ENUM kaya Class : CLASS : punya variable, constructor sama method seperti class
* fungsinya biar ENUM lebih fleksibel */

public enum EnumLikeClass {
    SUNDAY("Weekend"), MONDAY("Weekday");

    private String type;

    EnumLikeClass(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
