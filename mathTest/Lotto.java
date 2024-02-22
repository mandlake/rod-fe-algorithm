package mathTest;

import java.util.Arrays;

public class Lotto {
    /**
     * 서로 겹치지 않는 숫자 6개를 생성
     * 각 숫자는 1 ~ 45 범위 내의 숫자
     * 매번 실행 시 다른 숫자 출력
     * -> 랜덤수 : Math 사용
     * 오름차순 정렬
     */
    public static void main(String[] args) {
        int[] lotto = new int[6];

        int num = (int) (Math.random() * 45 + 1);
        lotto[0] = num;

        for(int i = 1; i < lotto.length; i++) {
            num = (int) (Math.random() * 45 + 1);
            for(int j = 0; j < i; j++) {
                while (num == lotto[j]) {
                    num = (int) (Math.random() * 45 + 1);
                }
            }
            lotto[i] = num;
        }

        Arrays.sort(lotto);

//        int temp;
//        for(int i = 0; i < lotto.length - 1; i++) {
//            for(int j = 0; j < (lotto.length - 1 - i); j++) {
//                if(lotto[j] > lotto[j + 1]) {
//                    temp = lotto[j];
//                    lotto[j] = lotto[j + 1];
//                    lotto[j + 1] = temp;
//                }
//            }
//        }

        for (int j : lotto) {
            System.out.println(j);
        }
    }
}
