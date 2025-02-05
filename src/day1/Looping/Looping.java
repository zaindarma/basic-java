package day1.Looping;

public class Looping {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        // for biasa
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Biasa: " + i);
        }

        // Enhanced loop
        for (int i : numbers){
            System.out.println("Enhanced : " + i);
        }

        // While loop
        int i = 0;
        while (i < numbers.length){
            System.out.println("While: " + i);
            i++;
        }

        // 3D Loop
//        for (int i = 0 ; i < array3D.length; i++){
//            for (int j = 0 ; j < array3D[i].length; j++){
//                for (int k = 0; k < array3D[i].length; k++){
//                    System.out.print(array3D[i][j][k]);
//                }
//                System.out.println();
//            }
//            System.out.println(); // Buat ngasih garis baru setiap elemen
//        }
    }
}
