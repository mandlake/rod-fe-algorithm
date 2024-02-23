package lotto;

import java.util.ArrayList;
import java.util.Arrays;

public class LottoMatching {
    /**
     * 로또 발급은 1 - 8까지 중복없는 6개 숫자. 하나는 구매한 로또이다.
     * 추가된 로직은 추첨된 로또이다.
     * 두 로또의 일치 여부에 따라 다음과 같은 메시지를 출력헌다.
     *
     * 8개 숫자
     * 1등 - 6개 맞춤
     * 2등 - 5개 맞춤
     * 3등 - 4개 맞춤
     * 4등 - 3개 맞춤
     * 권외 - 2개 이하
     *
     * 단, 구매로또 번호와 추첨 로또 번호 모두 같이 출력한다.
     */

    static int[] lotto(int[] arr) {
        for(int i=0; i<6; i++){
            int randomNumber = (int) (Math.random() * 8 + 1);
            boolean check = false;
            for(int j=0; j<6; j++){
                if(arr[j] == randomNumber){
                    // 중복되면  check 를 true 로 바꿔라..
                    check = true;
                }
            }
            if(check==false){
                arr[i] = randomNumber; // 중복되지 않았으니 배열에 담아라.
            }else{
                i--; // 중복됐으면 이번 회수는 무효로 하고 다시 뽑아라.
            }

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] lottoA = new int[6];
        int[] lottoP = new int[6];

        lottoA = lotto(lottoA);
        lottoP = lotto(lottoP);

        Arrays.sort(lottoA);

        for(int i : lottoA) {
            System.out.print(i + " ");
        }

        System.out.print("\n");

        Arrays.sort(lottoP);

        for(int i: lottoP) {
            System.out.print(i + " ");
        }

        int count = 0;

        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                if(lottoA[i] == lottoP[j]) {
                    count++;
                }
            }
        }

        System.out.print("\n");

        switch (count) {
            case 6 :
                System.out.print("1등");
                break;
            case 5 :
                System.out.print("2등");
                break;
            case 4 :
                System.out.print("3등");
                break;
            case 3 :
                System.out.print("4등");
                break;
            default :
                System.out.print("꼴등");
                break;
        }

    }
}
