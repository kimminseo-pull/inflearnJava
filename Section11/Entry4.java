package Section11;

import java.util.Scanner;

public class Entry4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("당신의 시험점수를 입력해주세요");
        int score = s.nextInt();
        char ch = 'A';

        if (score > 90) {
            ch = 'A';
        } else if (score > 80) {
            ch = 'B';
        }else if (score > 70) {
            ch = 'C';
        }else if (score > 60) {
            ch = 'D';
        }else {
            ch = 'E';
        }

        System.out.printf("당신의 점수는 %s 입니다",ch);
    }
}
