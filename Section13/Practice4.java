package Section13;

public class Practice4 {
    public static void main(String[] args) {
        int[] array = {40, 30, 50, 20, 10};
        int tmp;
        int minIndex = 0;


        for (int i = 0; i < array.length; i++) {
            minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                minIndex = j;
                }
                tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex]=tmp;
            }
        }



        for (int data : array) {
            System.out.println(data);
        }

    }
}
