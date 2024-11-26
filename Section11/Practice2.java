package Section11;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int price = 1000;
        Scanner s = new Scanner(System.in);
        System.out.println("나이를 입력해주세요");
        int age = s.nextInt();

        if (age < 20) {
            price = (int)(price * 0.75);
        }
        System.out.printf("지불하실 금액은 %.0f 원입니다",price);
    }
}
