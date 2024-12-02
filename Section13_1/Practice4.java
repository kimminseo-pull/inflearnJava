package Section13_1;

public class Practice4 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int cnt = 0;
        boolean flag = true;
        // 배열 값 채우기: 오른쪽에서 왼쪽으로 커지게
        for (int i = 0; i < 5; i++) {
            if (flag) {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] = ++cnt;
                }
            } else {
                for (int j =0; j < array[0].length; ++j) {
                    array[i][array[0].length - j - 1] = ++cnt;
            }

            }
            flag = !flag;
        }

        // 배열 값 출력
        for (int i = 0; i < array.length; i++) {
            for (int data : array[i]) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }
}

