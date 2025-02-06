package day2.AnonymousClass;

/* ANONYMOUS CLASS : class sementara yang mewaridi class parentnya
* ini cara singkat/sekali pake buat ngasih fungsi tambahan pada class dan interface yang udah ada
* daripada bikin class baru yang terpisah */

public class Main {
    public static void main(String[] args) {
        User user = new User("Zain", 22);

        UserInterface userActions = new UserInterface() {
            @Override
            public void displayUser() {
                System.out.println("username : " + user.getName());
                System.out.println("userage : " + user.getAge());
            }

            @Override
            public void updateUser() {
                System.out.println("User updated!");
            }
        };

        userActions.displayUser();
        userActions.updateUser();
    }
}
