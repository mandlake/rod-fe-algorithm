package lotto;

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
        // 1. 서로 겹치지 않는 숫자 6개를 생성
        int[] lotto = new int[6];

        // 2. 각 숫자는 1 ~ 45 범위 내의 숫자
        for(int i=0; i<6; i++){
            int randomNumber = (int) (Math.random() * 8 + 1);
            boolean check = false;
            for(int j=0; j<6; j++){
                if(lotto[j] == randomNumber){
                    // 중복되면  check 를 true 로 바꿔라..
                    check = true;
                }
            }
            if(check==false){
                lotto[i] = randomNumber; // 중복되지 않았으니 배열에 담아라.
            }else{
                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
            }

        }

        // 5. 오름차순 정렬

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
