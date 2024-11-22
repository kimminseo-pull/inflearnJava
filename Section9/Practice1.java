package Section9;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("평균을 구할 정수를 입력해 주세요");
        int a = s.nextInt();
        System.out.println("평균을 구할 정수를 입력해 주세요");
        int b = s.nextInt();
        double result = a/b;
        System.out.printf("입력하신값의 평균은 %.2f 입니다",result);
    }
}
