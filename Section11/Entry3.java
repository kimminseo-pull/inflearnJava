package Section11;

public class Entry3 {
    public static void main(String[] args) {
        int a = 10;
        if (a > 5) {
            //a가 이미 선언되어 선언불가
            int b =20;
            System.out.println(b);

        }
        //if 문 내에서 선언되었기 때문에 접근불가
    }
}
