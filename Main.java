import java.util.Scanner;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.print("이름 ? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.print("나이 ? ");
        String age = scanner.next();

        System.out.println("name: " + name);
        System.out.print("age: " + age);
    }
}