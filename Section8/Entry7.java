package Section8;

import java.util.Scanner;

public class Entry7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("나이를 입력하세요 :");
        int age = s.nextInt();
        s.nextLine();
        //nextInt는 엔터까지 읽어오기 떄문에 nextLine으로 버퍼에 남은 엔터제거
        
        System.out.print("이름을 입력하세요 :");
        String name = s.nextLine();

        System.out.printf("당신은%d살이고 이름은 '%s'입니다\n",age,name);
    }
}
