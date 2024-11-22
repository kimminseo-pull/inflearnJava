package Section9;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 사용자에게 입력 안내 메시지 출력
        System.out.println("시, 분, 초로 계산하고 싶은 초를 입력해주세요:");

        int totalSecond = s.nextInt();

        int hour = totalSecond/3600;
        int minute = (totalSecond%3600)/60;
        int second = totalSecond%60;

        System.out.printf("%d초는 %02d시간 %02d분 %02d초 입니다",totalSecond,hour,minute,second);
    }
}
