import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID ? ");
        String id = scanner.next();

        System.out.print("비밀번호 ? ");
        String pw = scanner.next();

        System.out.print("비번확인 ? ");
        String checkPw = scanner.next();

        System.out.print("이름 ? ");
        String name = scanner.next();

        System.out.print("주민번호 ? ");
        String socialNum1 = scanner.next();
        String socialNum2 = scanner.next();

        System.out.print("전화번호 ? ");
        String phoneNum1 = scanner.next();
        String phoneNum2 = scanner.next();
        String phoneNum3 = scanner.next();

        System.out.print("주소 ? ");
        String address = scanner.next();

        System.out.print("직업 ? ");
        String job = scanner.next();

        System.out.println("ID: " + id);
        System.out.println("비밀번호: " + pw);
        System.out.println("비번확인: " + checkPw);
        System.out.println("이름: " + name);
        System.out.println("주민번호: " + socialNum1 + " - " + socialNum2);
        System.out.println("전화번호: " + phoneNum1 + " - " + phoneNum2 + " - " + phoneNum3);
        System.out.println("주소: " + address);
        System.out.println("직업: " + job);
    }

}
