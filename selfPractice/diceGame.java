package selfPractice;

import java.util.Random;
import java.util.Scanner;

public class diceGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int result;
        int randomNum1 = 0;
        int randomNum2 = 0;

        System.out.println("주사위 게임을 시작하겠습니다");
        System.out.println("1.시작\t2.취소");
        int answer = s.nextInt();

        if (answer == 1) {
            randomNum1 = random();
            randomNum2 = random();

            System.out.println("첫 번째 주사위의 값은 " + randomNum1 + "입니다");
            System.out.println("두 번째 주사위의 값은 " + randomNum2 + "입니다");

            result = calculateResult(randomNum1, randomNum2);
            System.out.println("총 결과값은 " + result + "입니다");
        } else {
            System.out.println("게임이 취소되었습니다.");
        }

        s.close(); // Scanner 리소스 해제
    }

    // 주사위 값을 랜덤하게 생성하는 메서드 (1부터 6까지)
    public static int random() {
        Random random = new Random();
        return random.nextInt(6) + 1; // 1 ~ 6
    }

    // 점수를 계산하는 메서드
    public static int calculateResult(int a, int b) {
        int result = 0;

        if (a % 2 != 0 && b % 2 != 0) {
            // a와 b가 모두 홀수라면 a^2 + b^2 점수 얻기
            result = (int) Math.pow(a, 2) + (int) Math.pow(b, 2);
        } else if (a % 2 != 0 || b % 2 != 0) {
            // a와 b 중 하나만 홀수라면 2 * (a + b) 점수 얻기
            result = 2 * (a + b);
        } else {
            // a와 b 모두 홀수가 아니면 |a - b| 점수 얻기
            result = Math.abs(a - b);
        }

        return result;
    }
}
