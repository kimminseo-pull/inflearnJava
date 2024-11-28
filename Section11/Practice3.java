package Section11;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        int price = 1000;
        int age = 0;
        String a = "";

        Scanner s = new Scanner(System.in);
        System.out.println("당신의 나이를 입력해주세요");
        age = s.nextInt();

        if (age >= 14) {
            if (age > 20) {
                a = "성인";
            } else {
                price = (int) (price * 0.75);
                a = "청소년";
            }
        } else {
            if (age >= 4) {
                price = (int) (price * 50);
                a = "어린이";
            } else {
                price = 0;
                a = "영유아";
            }
        }

        System.out.printf("당신은 %s이고 버스요금은 %d원 입니다",a,price);
    }
}
