package Section13;

public class Practice2 {
    public static void main(String[] args) {
        int[] array = {40, 20, 30, 10, 50};
        int tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]+"\t");
        }
    }
}

