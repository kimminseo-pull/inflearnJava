package Section12;

import java.util.Scanner;

public class Entry2_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int max = input;
        int cnt = 1;
        while (cnt < 5) {
            input = s.nextInt();
            if (input > max) {
                max = input;
            }
            cnt++;
        }
        System.out.println("max:"+max);
        }
    }

