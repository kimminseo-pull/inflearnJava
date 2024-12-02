package Section14;

public class Entry2 {
    static int testData = 10;
    public static void main(String[] args) {
        System.out.println("start" + testData);
        Entry2.testFunc();
        System.out.println("end"+testData);
    }

    public static void testFunc() {
        int testData = 10;
        Entry2.testData = 300;
        System.out.println("testFunc()"+testData);
    }
}
