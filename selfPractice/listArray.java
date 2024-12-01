package selfPractice;

import java.util.Arrays; // Arrays 클래스 임포트

public class listArray {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        // Arrays.toString()을 사용하여 배열을 출력
        System.out.println(Arrays.toString(solution(num_list)));
    }

    public static int[] solution(int[] num_list) {
        int tmp;
        int minIdx;

        // 선택 정렬 알고리즘
        for (int i = 0; i < num_list.length; i++) {
            minIdx = i; // 현재 위치를 최소값으로 가정

            // 현재 위치 이후의 요소들과 비교하여 최솟값을 찾는다.
            for (int j = i + 1; j < num_list.length; j++) {
                if (num_list[minIdx] > num_list[j]) {
                    minIdx = j; // 더 작은 값을 찾으면 minIdx 갱신
                }
            }

            // 최솟값을 현재 위치와 교환
            tmp = num_list[i];
            num_list[i] = num_list[minIdx];
            num_list[minIdx] = tmp;
        }

        return num_list; // 정렬된 배열 반환
    }
}
