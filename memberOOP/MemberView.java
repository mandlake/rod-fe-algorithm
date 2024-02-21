package memberOOP;

import java.util.Scanner;

public class MemberView {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("id, pw, pwAgain, name, personId, phoneNumber, address, job 입력해주세요");
        Member member = new Member(sc.next(), sc.next(), sc.next(), sc.next(),
                sc.next(), sc.next(), sc.next(), sc.next());

        System.out.println(member.toString());
    }
}