package Section11;

import java.util.Scanner;

public class Entry6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        char ch = 'A';

        switch (score/10) {
            case 10:
            case 9:
                ch = 'A';
                break;
            case 8:
                ch = 'B';
                break;
            default:
                ch = 'F';
        }
        System.out.println(ch);
    }
}
