package Section10;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int result = 0;
//        System.out.println("비교할 첫번째 정수를 입력해주세요");
        int score = s.nextInt();
//        System.out.println("비교할 두번째 정수를 입력해주세요");
        score = s.nextInt();
        result = (result>score) ? result : score;    
//        System.out.println("비교할 세번째 정수를 입력해주세요");
        score = s.nextInt();
        result = (result>score) ? result : score;

        System.out.println("입력하신값중 제일 큰 값은 :" + result + "입니다");

    }
}
