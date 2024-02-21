package baekjoon;

import java.util.Scanner;

public class BulbSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[][] bulbs = new int[2][num];

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < num; j++) {
                bulbs[i][j] = scanner.nextInt();
            }
        }

        int[] countSwitch = new int[num];
    }
}
