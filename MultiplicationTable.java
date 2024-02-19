import java.util.Scanner;

public class MultiplicationTable {

    static int max(int[] scores) {
        int max = 0;

        for(int i = 0; i < scores.length; i++) {
            if(scores[i] > scores[max]) {
                max = i;
            }
        }

        return max;
    }

    static int average(int[] scores) {
        int avg = 0;

        for(int i = 0; i < scores.length; i++) {
            avg += scores[i];
        }

        return avg;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudent1 = scanner.nextInt();
        int numberOfStudent2 = scanner.nextInt();

        int[] scores1 = new int[numberOfStudent1];
        int[] scores2 = new int[numberOfStudent2];

        for(int i = 0; i < scores1.length; i++) {
            scores1[i] = (int) (Math.random() * 100);
        }

        for(int i = 0; i < scores2.length; i++) {
            scores2[i] = (int) (Math.random() * 100);
        }

        System.out.println("1반 평균 : " + average(scores1)/numberOfStudent1);
        System.out.println("1반 1등 : " + max(scores1));

        System.out.println("2반 평균 : " + average(scores2)/numberOfStudent2);
        System.out.println("2반 1등 : " + max(scores2));

        System.out.println("전체 : " + (average(scores1) + average(scores2))/(numberOfStudent1 + numberOfStudent2));
        if(max(scores1) > max(scores2)) {
            System.out.println("1등 : " + scores1[max(scores1)]);
        } else {
            System.out.println("1등 : " + scores2[max(scores2)]);
        }
    }
}
