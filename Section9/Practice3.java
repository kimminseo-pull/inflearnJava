package Section9;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        int a = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("더할 첫번째 정수 입력해주세요");
        a += s.nextInt();
        System.out.println("더할 두번째 정수 입력해주세요");
        a += s.nextInt();
        System.out.println("더할 세번째 정수 입력해주세요");
        a += s.nextInt();
        System.out.println(a);
    }
}
