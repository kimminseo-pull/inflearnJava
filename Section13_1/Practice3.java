package Section13_1;

public class Practice3 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int cnt = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = ++cnt;
            }
        }

        for (int k = 0; k < array.length; k++) {
            if (k % 2 == 1) {
                for (int i = 0; i < array[k].length - 1; i++) {
                    int idxMax = i;
                    for (int j = 1 + i; j < array[k].length; j++) {
                        if (array[k][idxMax] < array[k][j]) {
                            idxMax = j;
                        }
                    }
                    int tmp = array[k][i];
                    array[k][i] = array[k][idxMax];
                    array[k][idxMax] = tmp;
                }
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
