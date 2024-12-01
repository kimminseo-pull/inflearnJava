package selfPractice;

import java.util.Scanner;

public class solutionFunc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(solution(number));
    }

    public static int solution(int param) {
        int n = 2;
        int m = 3;
        int result;
        if (param % n == 0 && param % m == 0) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }
}
