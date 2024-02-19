package baekjoon;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        money = 1000 - money;

        int change = 0;
        int[] coin = {500, 100, 50, 10, 5, 1};

        for(int i = 0; i < 6; i++) {
            if(money >= coin[i]) {
                change += (money/coin[i]);
                money %= coin[i];
            }
        }
        System.out.println(change);
    }
}
