package selfPractice;

import java.util.Scanner;

public class arrAddMul {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner s = new Scanner(System.in);
        System.out.println("배열의 추가할 5개의 정수를 입력해주세요");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("k값을 입력해주세요 홀수면 배열 각요소에 곱하고 짝수일시 더합니다");
        int k = s.nextInt();
        addMultiple(arr, k);
        for (int num : arr) {
            System.out.print(num + "\t");
        }
    }

    public static void addMultiple(int[] arr, int k) {
        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] += k;
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                arr[i] *= k;
            }
        }
    }
}
