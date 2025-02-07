package day3.Enums;

/* ENUM TEST
* Buat class untuk mengelola hak akses user menggunakan role dengan spesifikasi berikut :
* 1. Buat enum userAccess dengan nilai: CREATE, EDIT, DELETE, DISPLAY_DASHBOARD, dan USER_MANAGEMENT
* 2. Buat enum Role yang masing-masing role punya akses berikut:
*    - ADMIN punya semua akses
*    - EDITOR punya akses CREATE, EDIT, dan DISPLAY_DASHBOARD
*    - GUEST cuma punya akses DISPLAY_DASHBOARD
* 3. Buat kelas User dengan atribut name dan role
* 4. Buat method untuk validasi dan menampilkan apakah user punya hak akses tertentu
* 5. buat main method untuk eksekusinya didalam satu file ini */

import java.util.EnumSet;
import java.util.Set;

public class Test {
    // Nomor 1
    private enum userAccess {
        CREATE, EDIT, DELETE, DISPLAY_DASHBOARD, USER_MANAGEMENT
    }

    // Nomor 2, Menentukan access role
    private enum Role {
        ADMIN(EnumSet.of(userAccess.CREATE, userAccess.DELETE, userAccess.USER_MANAGEMENT, userAccess.DELETE, userAccess.EDIT, userAccess.DISPLAY_DASHBOARD)),
        EDITOR(EnumSet.of(userAccess.CREATE, userAccess.EDIT, userAccess.DISPLAY_DASHBOARD)),
        GUEST(EnumSet.of(userAccess.DISPLAY_DASHBOARD));

        EnumSet<userAccess> access;

        Role(EnumSet<userAccess> access){
            this.access = access;
        }
    }

    // Nomor 3
    private static class User {
        String name;
        Role role;

        public User(String name, Role role){
            this.name = name;
            this.role = role;
        }

        // Nomor 4
        public void checkRole(userAccess access){
            if (role.access.contains(access)){
                System.out.println(name + " Adalah " + role + " dan memiliki akses : " + role.access);
            } else {
                System.out.println("- " + name + " Adalah " + role + " Tidak memiliki akses " + access + ", dan hanya memiliki akses : " + role.access);
            }
        }

        public void showAccess(){
            System.out.println("- " + name + " Adalah " + role + " Memiliki akses : " + role.access);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== DATA SESUAI ===");
        User user1 = new User("Zain", Role.ADMIN);
        user1.showAccess();

        User user2 = new User("Ridho", Role.EDITOR);
        user2.showAccess();

        User user3 = new User("Maruf", Role.GUEST);
        user3.showAccess();

        // Contoh pemanggilan tanpa hak akses
        System.out.println("=== DATA TIDAK SESUAI ===");
        User user4 = new User("Fachri", Role.GUEST);
        user4.checkRole(userAccess.CREATE);
    }
}
