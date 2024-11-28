package Section13_1;

public class Practice2 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int cnt = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array [i][j] = ++cnt;
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
