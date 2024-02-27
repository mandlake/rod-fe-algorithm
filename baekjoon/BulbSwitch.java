package baekjoon;

import java.util.Scanner;

public class BulbSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String current = scanner.next();
        String target = scanner.next();

        int[] current_1 = new int[n];
        int[] current_2 = new int[n];
        int[] target_int = new int[n];

        for (int i = 0; i < n; i++) {
            current_1[i] = current.charAt(i) - '0';
            current_2[i] = current.charAt(i) - '0';
            target_int[i] = target.charAt(i) - '0';
        }
        int count_1 = 1;
        int count_2 = 0;
        int INF = 987654321;

        current_1[0] = 1 - current_1[0];
        current_1[1] = 1 - current_1[1];

        for(int i = 1; i < n; i++) {
            if(current_1[i - 1] != target_int[i - 1]) {
                current_1[i - 1] = 1 - current_1[i - 1];
                current_1[i] = 1 - current_1[i];
                count_1++;
                if(i != n - 1) {
                    current_1[i + 1] = 1 - current_1[i + 1];
                }
            }
            if(current_2[i - 1] != target_int[i - 1]) {
                current_2[i - 1] = 1 - current_2[i - 1];
                current_2[i] = 1 - current_2[i];
                count_2++;
                if(i != n - 1) {
                    current_2[i + 1] = 1 - current_2[i + 1];
                }
            }
        }

        if(current_1[n-1] != current_1[n - 1]) count_1 = INF;
        if(current_2[n-1] != current_2[n - 1]) count_2 = INF;

        if(count_1 == INF && count_2 == INF) System.out.println(-1);
        else System.out.println(Math.max(count_1, count_2));
    }
}