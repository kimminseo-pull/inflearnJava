package Section11;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int max = input;
        input = s.nextInt();
        if (input > max) {
            max = input;
        }
        input = s.nextInt();
        if (input > max) {
            max = input;
        }
        System.out.println(max);
    }
}
