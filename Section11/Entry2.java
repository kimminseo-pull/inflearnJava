package Section11;

import java.util.Scanner;

public class Entry2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        if (input > 10) {
            System.out.println("if () {}");
            input = 10;
        }
        System.out.println("main () - end " + input);
    }
}
