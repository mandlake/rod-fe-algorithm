package baekjoon;

import java.util.*;

public class StringChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alphabet = sc.nextLine();

        while (!alphabet.isEmpty() && alphabet.charAt(0) == alphabet.charAt(alphabet.length() - 1)) {
            alphabet = alphabet.substring(0, alphabet.length() - 1);
        }

        char[] chars_1 = new char[alphabet.length()];
        for (int i = 0; i < alphabet.length(); i++) {
            chars_1[i] = alphabet.charAt(i);
        }
        int count = 0;

        for(int i = 0; i < alphabet.length() - 2; i++) {
            StringBuilder temps = new StringBuilder();
            StringBuilder temps2 = new StringBuilder();
            for(int j = i + 1; j < alphabet.length(); j++) {
                while (j < alphabet.length() && chars_1[i] != chars_1[j]) {
                    temps.append(chars_1[j]);
                    j++;
                }
                while (j < alphabet.length() && chars_1[i] == chars_1[j]) {
                    temps2.append(chars_1[j]);
                    j++;
                }
                if(!temps2.toString().isEmpty() && !temps.toString().isEmpty()) {
                    count++;
                    i = j - 1;
                    j = alphabet.length();
                }
            }
        }
        System.out.println(count);
    }
}
