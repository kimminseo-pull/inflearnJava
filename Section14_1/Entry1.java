package Section14_1;

public class Entry1 {
    public static void main(String[] args) {
        System.out.println(loop(5));
        System.out.println(factorialLoop(5));
    }

    public static int loop(int param) {
        int result = 1;
        for (int i = 1; i <= param; i++) {
            result *=i;
        }
        return result;
    }

    public static int factorialLoop(int param) {
        if(param == 1) return 1;
        int result = param * factorialLoop(param - 1);
        return result;
    }
}
