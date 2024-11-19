package Section9;

public class Entry1_2 {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(max+1L);
        System.out.println("max : "+ max + 1L);
        //max와 1을 문자열로 묶어버림 
        System.out.println("max : "+ (max + 1L));
        //()로 묶어줘야됌
    }
}
