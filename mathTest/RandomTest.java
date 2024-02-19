package mathTest;

public class RandomTest {

    public static int returnRandomNumber() {
        int randomNumber = (int) (Math.random() * 100);
        System.out.println("랜덤 값: " + randomNumber);
        return randomNumber;
    }
    public static void main(String[] args) {
        int randomNum = returnRandomNumber();
        System.out.println("값: " + randomNum);
    }
}
