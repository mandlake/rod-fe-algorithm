import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("시험에 응시한 학생 수는 얼마입니까?");
        int count = scanner.nextInt();

        System.out.println("1등한 학생은? ");
        int[] score = new int[count];
        String[] name = new String[count];

        int num = 0;

        for(int i = 0; i < score.length; i++) {
            System.out.println("점수를 입력하시오.");
            score[i] = scanner.nextInt();

            System.out.println("이름을 입력하세요.");
            name[i] = scanner.next();

            if(score[i] >= score[num]) {
                num = i;
            }
        }

        System.out.println("1등 학생 : " + name[num]);

//        System.out.println("1등한 학생은? ");
//        String[][] students = new String[count][2];
//
//        int num = 0;
//
//        for(int i = 0; i < count; i++) {
//            System.out.println("이름, 점수 : ");
//            for(int j = 0; j < 2; j++) {
//                students[i][j] = scanner.next();
//            }
//
//            if(Integer.parseInt(students[i][1]) >= Integer.parseInt(students[0][1])) {
//                num = i;
//            }
//        }
//
//        System.out.println("1등 학생 : " + students[num][0]);
    }
}

