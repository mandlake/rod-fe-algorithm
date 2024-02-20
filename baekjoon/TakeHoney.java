package baekjoon;

import java.util.Scanner;

public class TakeHoney {
    public static void main(String[] args) {
        int MAX = 10001;
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] Honey = new int[MAX];
        int[] Sum = new int[MAX];
        int Answer = 0;

        for(int i = 1; i < N; i++) {
            Honey[i] = sc.nextInt();
            Sum[i] = Sum[i - 1] + Honey[i];
        }

        for (int i = 2; i < N; i++) {
            int cur = (Sum[i] - Sum[1]) + (Sum[N - 1] - Sum[i - 1]);
            if(cur > Answer) {
                Answer = cur;
            }
        }

        // 2. 벌 - 벌 - 꿀통
        for (int i = 2; i < N; i++) {
            int cur = (Sum[N] - Sum[1] - Honey[i]) + (Sum[N] - Sum[i]);
            if(cur > Answer) {
                Answer = cur;
            }
        }

        // 3. 꿀통 - 벌 - 벌
        for (int i = 2; i < N; i++) {
            int cur = (Sum[N - 1] - Honey[i]) + Sum[i - 1];
            if(cur > Answer) {
                Answer = cur;
            }
        }

        System.out.println(Answer);
    }
}
