import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dwarf = new int[9];
        int dwarfSum = 0;

        for(int i = 0; i < dwarf.length; i++) {
            dwarf[i] = scanner.nextInt();
            dwarfSum += dwarf[i];
        }

        int a = 0;
        int b = 0;


        for(int i = 0; i < dwarf.length; i++) {
            for(int j = i + 1; j < dwarf.length; j++) {
                Arrays.sort(dwarf);
                if(dwarfSum - dwarf[i] - dwarf[j] == 100) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        for (int i = 0; i < dwarf.length; i++) {
            if(dwarf[i] != dwarf[a] && dwarf[i] != dwarf[b]) {
                System.out.print(dwarf[i] + " ");
            }
        }
    }
}
