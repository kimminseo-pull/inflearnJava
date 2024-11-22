package Section10;

import java.util.Scanner;

public class Practice2  {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int score = s.nextInt();
        score = Math.max(score,0);
        score = Math.min(score,100);
        String result =  (score >= 80) ? "합격" : "불합격";
        System.out.println(result);
        System.out.println(score);
    }
}
