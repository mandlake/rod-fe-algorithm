import java.util.Scanner;

public class TakeHoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] cases = new int[N];

        for(int i = 0; i < N; i++) {
            cases[i] = scanner.nextInt();
        }
    }
}
