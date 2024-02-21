package baekjoon;

import java.util.Scanner;

public class SevenDwarf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dwarf = new int[9];
        int dwarfSum = 0;
        int temp;

        for(int i = 0; i < 9; i++) {
            dwarf[i] = scanner.nextInt();
            dwarfSum += dwarf[i];
        }

        // Arrays.sort(dwarf);

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < (8 - i); j++) {
                if (dwarf[j] > dwarf[j + 1]) {
                    temp = dwarf[j];
                    dwarf[j] = dwarf[j + 1];
                    dwarf[j + 1] = temp;
                }
            }
        }

        dwarfSum -= 100;

        // 합해서 40이 되는 수 2개 를 0으로 초기화

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < (9 - i); j++) {
                if(dwarf[i] + dwarf[i + j] == dwarfSum && dwarf[i] != dwarf[i + j]) {
                    dwarf[i] = 0;
                    dwarf[i + j] = 0;
                    break;
                }
            }
        }

        // 두 수를 제거하고 출력

        for(int i = 0; i < 9; i++) {
            if(dwarf[i] > 0) {
                System.out.println(dwarf[i]);
            }
        }
    }
}