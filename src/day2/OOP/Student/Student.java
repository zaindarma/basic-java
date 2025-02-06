package day2.OOP.Student;

public class Student {;
    public String name;
    public int score;
    private Boolean isPass;

    public Student(String studentName, int studentScore) {
        name = studentName;
        score = studentScore;
        isPass = false;
    }



    public void cekStatus(){
        if(score >= 85){
            isPass = true;
            System.out.println("Nama : " + name + " , Score : " + score + " , isPass : " + isPass);
            System.out.println("Status : Lulus");
        } else {
            System.out.println("Nama : " + name + " , Score : " + score + " , isPass : " + isPass);
            System.out.println("Status : Tidak Lulus");
        }
    }
}
