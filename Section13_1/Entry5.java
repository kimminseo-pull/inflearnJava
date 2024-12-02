package Section13_1;

public class Entry5 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = arr1.clone();
//        int[] arr2 = new int[arr1.length];
//
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
        arr2[2] = 100;
        for (int data : arr1) {
            System.out.print(data + "\t");
        }
        System.out.println();
        for (int data : arr2) {
            System.out.print(data + "\t");
        }

    }


}
