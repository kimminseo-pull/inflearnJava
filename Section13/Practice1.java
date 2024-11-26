package Section13;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int[] array  = new int[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("값" + (i + 1) + ":");
            array[i] = s.nextInt();
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("max:"+max);
    }
}
