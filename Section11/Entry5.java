package Section11;

import java.util.Scanner;

public class Entry5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int left = s.nextInt();
        char operater = s.next().charAt(0);
        int right = s.nextInt();
        int result = 0;

        switch (operater) {
            case '+' -> {
                result = left + right;
                break;
            }
            case '-' -> {
                result = left - right;
                break;
            }
            case '*' -> {
                result = left * right;
                break;
            }
            case '/' -> {
                result = left / right;
                break;
            }
            case '%' -> {
                result = left % right;
                break;
            }
        }
        System.out.println(result);
    }
}
