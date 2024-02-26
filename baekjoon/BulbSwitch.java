package baekjoon;

import java.util.Scanner;

public class BulbSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] bulbsStart = new int[num];
        int[] bulbsFin = new int[num];
        boolean[] bulbs = new boolean[num];
        int count = 0;

        for(int i = 0; i < num; i++) {
            bulbsStart[i] = scanner.nextInt();
        }
        for(int i = 0; i < num; i++) {
            bulbsFin[i] = scanner.nextInt();
        }

        for(int i = 0; i < num; i++) {
            if(bulbsStart[i] == bulbsFin[i]) {
                bulbs[i] = true;
            } else {
                bulbs[i] = false;
            }
        }

        for(int i = 0; i < num; i+= 3) {
            if(bulbs[i] != bulbs[i + 2]) {
                count++;
            } else if (bulbs[i + 1]) {
                if(!bulbs[i] && !bulbs[i + 2]) {
                    count += 2;
                }
            } else {
                if(bulbs[i] && bulbs[i + 2]) {
                    count += 3;
                } else if (bulbs[i] == bulbs[i + 1] || bulbs[i + 1] == bulbs[i + 2]) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
