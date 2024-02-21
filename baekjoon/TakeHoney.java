package baekjoon;

import java.util.Scanner;

public class TakeHoney {
    public static void main(String[] args) {
        int max = 100001;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] Honey = new int[max];
        int[] Sum = new int[max];
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            Honey[i] = sc.nextInt();
            Sum[i] = Sum[i - 1] + Honey[i];
        }
        
        // 1. 벌 - 꿀 - 벌

        for (int i = 2; i < n; i++) {
            int cur = (Sum[i] - Sum[1]) + (Sum[n - 1] - Sum[i - 1]);
            if(cur > answer) {
                answer = cur;
            }
        }

        // 2. 벌 - 벌 - 꿀
        for (int i = 2; i < n; i++) {
            int cur = (Sum[n] - Sum[1] - Honey[i]) + (Sum[n] - Sum[i]);
            if(cur > answer) {
                answer = cur;
            }
        }

        // 3. 꿀 - 벌 - 벌
        for (int i = 2; i < n; i++) {
            int cur = (Sum[n - 1] - Honey[i]) + Sum[i - 1];
            if(cur > answer) {
                answer = cur;
            }
        }

        System.out.println(answer);
    }
}
