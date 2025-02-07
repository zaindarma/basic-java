package day3.Enums;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetOf {
    enum Menu {
        INDOMIE,
        PECEL_AYAM,
        ES_TEH,
        KOPI
    }

    public static void main(String[] args) {
        // Nambahin menu ke dalam set
        Set<Menu> availableMenu = EnumSet.of(Menu.INDOMIE, Menu.PECEL_AYAM);

        // Nambahin menu lain
        availableMenu.add(Menu.ES_TEH);

        // Cek menu ada kaga
        if (availableMenu.contains(Menu.KOPI)) {
            System.out.println("Menu is available");
        } else {
            System.out.println("ABIS COYYYYY");
        }

        System.out.println("Todays menu : " + availableMenu);
    }
}
