package Section14;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner s = new Scanner(System.in);
        System.out.println("최대값을 구할 정수3개를 입력해주세요");
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }
        int maxNum = getMax(array);
        System.out.println("입력하신값중 최대값은" + maxNum + "입니다");
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}