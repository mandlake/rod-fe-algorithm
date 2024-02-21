package mathTest;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요 : ");
        String firstNumber = input.next();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        String secondNumber = input.next();
        System.out.println("+ - * / 중 하나를 입력하세요.");
        String opcode = input.next();

        int number = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);

        System.out.println("첫 번재 입력 숫자 : " + firstNumber + "\n두 번째 입력 숫자 : " + secondNumber);
        int result = 0;



       /* if (opcode.equals("+")) {
            result = number + number2;
        } else if (opcode.equals("-")) {
            result = number - number2;
        } else if (opcode.equals("*")) {
            result = number * number2;
        } else if (opcode.equals("/")) {
            result = number / number2;
        } else {
            System.out.println("연산 기호를 잘못 선택했습니다.");
        }*/

        switch (opcode){
            case "+":
                result = number + number2;
                break;
            case "-":
                result = number - number2;
                break;
            case "*":
                result = number * number2;
                break;
            case "/":
                result = number / number2;
                break;
            default:
                System.out.println("연산 기호를 잘못 선택했습니다");
        }

        System.out.println("연산 결과 : " + result);


    }
}