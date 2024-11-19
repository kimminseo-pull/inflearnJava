package Section9;

public class Entry1_1 {
    public static void main(String[] args) {

        double result1 = 5/2;
        double result2 = 5.0/2;
        double result3 = (double)5/2;
        double result4 = 3.3/1.1;
        // int result4 = 3.3/1.1;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        // 형승격(type promotion)
        // 자료형이 더 큰쪽을 따라감
        //byte < char < short < int < long
    }
}
