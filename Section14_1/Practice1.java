package Section14_1;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String hello = s.nextLine();
        reversPrint(hello,hello.length() -1);

    }

    public static void reversPrint(String ch , int idx) {
        if (idx < 0) return;
        System.out.print(ch.charAt(idx));
        reversPrint(ch,idx-1);

    }
}
