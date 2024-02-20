package bmiOOP;

import java.util.Scanner;

public class BmiView {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Person person = new Person();

        String name = scanner.next();
        person.setName(name);

        double weight = Math.random() * 69 + 30; // 30-99
        person.setWeight(weight);

        double height = Math.random() * 50 + 150; // 150-200
        person.setHeight(height);

        person.createBmi();

        System.out.printf("이름: %s ", person.getName());
        System.out.printf("몸무게: %.1f ", person.getWeight());
        System.out.printf("키: %.1f ", person.getHeight());
        System.out.printf("BMI: %.1f ", person.getBmi());
        person.createBodyMass();

        System.out.println(person.getBodyMass());

    }
}
