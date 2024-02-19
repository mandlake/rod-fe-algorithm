package methodTest;

import java.util.Scanner;

public class WhatName {
    static String names(String lastName) {
        return "Eric" + lastName;
    }

    public static String inputName(Scanner sc) {
        return sc.next();
    }
    public static void main(String[] args) {
        String lastName = "Gamma";
        String name = names(lastName);
        System.out.println("이름 : " + name);
    }
}
