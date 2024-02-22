package methodTest;

import java.util.Scanner;

public class MenuSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("[메뉴] 0.종료 1.진행 2. 수정 ");
            String menu =scanner.next();
            switch (menu) {
                case "0":
                    System.out.println("end");
                    break;
                case "1":
                    System.out.println("continue");
                    break;
                default:
                    System.out.println("repair");
            }
        }
    }
}
