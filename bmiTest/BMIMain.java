package bmiTest;

public class BMIMain {
    // BMI 지수 구하는 프로그램을 작성해 주세요. - 체중/신장^2
    public static void main(String[] args) {
        double weight = Math.random() * 69 + 30; // 30-130
        double height = Math.random() * 50 + 150; // 150-200

        double BMI = weight/((height/100) * (height/100));

        System.out.printf("몸무게: %.1f ", weight);
        System.out.printf("키: %.1f ", height);
        System.out.printf("BMI: %.1f ", BMI);
    }
}
