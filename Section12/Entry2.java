package Section12;

import java.util.Scanner;

public class Entry2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input number");
        int input = s.nextInt();

        while (input > 0) {
            System.out.print("*\t");
            input--;
        }
        System.out.println("\nend");
    }
}
