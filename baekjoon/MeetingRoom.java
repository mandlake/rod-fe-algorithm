package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MeetingRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] meeting = new int[n][2];
        int time = 0;
        int count = 0;

        for(int i = 0; i < n; i++) {
            meeting[i][0] = scanner.nextInt();
            meeting[i][1] = scanner.nextInt();
        }

        Arrays.sort(meeting, Comparator.comparingInt((int[] o) -> o[1]));

        for(int i = 0; i < n; i++) {
            if(meeting[i][0] >= time) {
                time = meeting[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}
