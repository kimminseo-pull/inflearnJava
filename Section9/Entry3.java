package Section9;

import java.util.Scanner;

public class Entry3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // 입력 안내 메시지 출력 및 버퍼 플러시
        System.out.println("정수를 입력하시오");
        System.out.flush(); // 출력 버퍼 비우기

        // 사용자 입력 받기
        int input = s.nextInt();

        // 결과 출력
        System.out.println("입력하신 값을 10으로 나눈 결과는 " + (10 / input) + "입니다");

        // Scanner 객체 닫기
        s.close();
    }
}
