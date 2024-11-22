package Section9;

import java.util.Scanner;

public class finalSample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("탑승자의 키를 입력해주세요");
        int userHeight = s.nextInt();

        final int limit = 150;
        if(userHeight > limit) System.out.println("탑승 가능합니다");
        else System.out.println("탑승 불가능합니다");
    }
}
