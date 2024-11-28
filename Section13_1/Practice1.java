package Section13_1;

public class Practice1 {
    public static void main(String[] args) {
        int[][] array = {
                {10, 20, 30, 0},
                {40, 50, 60, 0},
                {0, 0, 0, 0}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][3] += array[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                array[2][i] += array[j][i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int data : array[i]) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }
}
