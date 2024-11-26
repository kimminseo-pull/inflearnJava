package Section13;

public class Practice3 {
    public static void main(String[] args) {
        int[] array = {40, 30, 50, 20, 10};

        // **1단계: 인덱스 0을 기준으로 비교**
        /*
        int minIndex = 0;
        for (int j = 1; j < array.length; j++) { // 나머지 요소와 비교
            if (array[j] < array[minIndex]) {
                minIndex = j; // 최소값의 인덱스를 업데이트
            }
        }
        // 최소값과 현재 위치 교환
        int tmp = array[0];
        array[0] = array[minIndex];
        array[minIndex] = tmp;

        // 배열 상태 출력
        System.out.println("Step 1: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // **2단계: 인덱스 1을 기준으로 비교**
        minIndex = 1;
        for (int j = 2; j < array.length; j++) { // 나머지 요소와 비교
            if (array[j] < array[minIndex]) {
                minIndex = j; // 최소값의 인덱스를 업데이트
            }
        }
        tmp = array[1];
        array[1] = array[minIndex];
        array[minIndex] = tmp;

        // 배열 상태 출력
        System.out.println("Step 2: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        */

        // **종합 반복문: 3단계부터 나머지 처리**
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) { // 나머지 요소와 비교
                if (array[j] < array[minIndex]) {
                    minIndex = j; // 최소값의 인덱스를 업데이트
                }
            }

            // 최소값을 현재 위치와 교환
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;

            // 현재 단계의 배열 상태 출력
            System.out.println("Step " + (i + 1) + ": ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // 최종 결과 출력
        System.out.println("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
