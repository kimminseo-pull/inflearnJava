package Section12;

import java.util.Scanner;

public class Entry1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = 10;
        while (input > 0) {
            System.out.println(input);
            input= s.nextInt();
        }
    }
}
