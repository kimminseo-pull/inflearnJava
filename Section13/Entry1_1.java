package Section13;

public class Entry1_1 {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 30, 40, 50};

        array[0] = 100;
        array[3] = 200;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
