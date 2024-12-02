package selfPractice;

public class arrayAdd {
    public static void main(String[] args) {
        int[] numbers = {3, 15, 7, 29, 100, 34};
        int result = solution(numbers);
        System.out.println(result);
    }

    public static int solution(int[] numbers) {
        int n = 0;
        for (int i = 0; i < numbers.length; i++) {
            n += numbers[i];
            if (n > numbers[i + 1]) {
                break;
            }
        }
        return n;
    }
}
