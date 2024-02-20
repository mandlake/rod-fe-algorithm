package GradeOOP;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("다음은 한 학생의 과목 점수이다.");
        System.out.println("이름 : ");
        String name = sc.next();
        student.setName(name);
        System.out.println("국어점수 : ");
        int korea = sc.nextInt();
        student.setKorea(korea);
        System.out.println("영어점수 : ");
        int english = sc.nextInt();
        student.setEnglish(english);
        System.out.println("수학점수 : ");
        int math = sc.nextInt();
        student.setMath(math);
        System.out.println("평균 점수를 구하시오");
        student.createAverage();


        System.out.println(" ============= 성적표 ==============");
        System.out.println("이름 : " + student.getName());
        System.out.println("국어점수 : " + student.getKorea());
        System.out.println("영어점수 : " + student.getEnglish());
        System.out.println("수학점수 : " + student.getMath());
        System.out.println("평균 점수: " + student.getAverage());

    }
}