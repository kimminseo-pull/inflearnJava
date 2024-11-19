package Section8;

import java.util.Scanner;

public class Entry4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{  int a = s.nextInt();
        // double b = s.nextDouble();
        System.out.println("a:"+a);
        // System.out.println("b:"+b);
        } catch (Exception e){
            System.out.println("ERROR");
        }
      
    }
}
