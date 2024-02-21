package bmiOOP;

import memberOOP.Member;

public class BmiView {
    public static void main(String[] args) {

        Member person = new Member(Math.random() * 69 + 30,
                Math.random() * 50 + 150);

        BmiService service = new BmiServiceImpl();

        double bmi = service.createBmi();
        String bodyMass = service.createBodyMass();

        System.out.printf("이름: %s ", person.getName());
        System.out.printf("몸무게: %.1f ", person.getWeight());
        System.out.printf("키: %.1f ", person.getHeight());
        System.out.printf("BMI: %.1f ", bmi);

        System.out.println(bodyMass);

    }
}
