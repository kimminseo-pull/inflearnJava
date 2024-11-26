package Section13;

public class Entry1 {
    public static void main(String[] args) {
        int[] array = {10, 20, 40, 50, 70};
        int idx = 0;
        System.out.println(array.length);

        for (int data : array) {
            System.out.println("araay [" + idx + "] :" + data);
            idx++;

        }
    }
}
