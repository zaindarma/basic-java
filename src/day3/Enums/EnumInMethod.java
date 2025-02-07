package day3.Enums;

import day2.Interfaces.Role;

public class EnumInMethod {
    enum Role{
        ADMIN, GUEST
    }

    public static void getRole(Role role){
        System.out.println("Hi, " + role);
    }

    public static void main(String[] args) {
        getRole(Role.ADMIN);
    }
}
