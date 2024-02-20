package baekjoon;

import java.util.Scanner;

public class TakeHoney {
    public static void main(String[] args) {
        int MAX = 10001;
        Scanner sc = new Scanner(System.in);
        int[] Honey = new int[MAX];
        int[] Sum = new int[MAX];

        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            Honey[i] = sc.nextInt();
            Sum[i] = Sum[i-1] + Honey[i];
        }

        // 벌꿀벌
        // 꿀꿀벌
        // 벌꿀꿀
    }
}
