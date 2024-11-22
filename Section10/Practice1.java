package Section10;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("뺄셈을 할 두정수를 입력해주십시오");
        int a = s.nextInt(),b= s.nextInt();
        int result = a+(~b+1);
        System.out.println(result);
    }
}
