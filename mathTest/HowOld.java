package mathTest;

import java.util.Scanner;

public class HowOld
{
    public static int inputAge(Scanner sc) {
        return sc.nextInt();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ages = inputAge(sc);
        System.out.println("나이 : " + ages);
    }
}
