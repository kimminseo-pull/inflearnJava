package Section10;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int result = 0;

        result = (a>b)? a : b;
        result = (result>c)? result : c;

        System.out.println("Max:"+result);

    }
}
