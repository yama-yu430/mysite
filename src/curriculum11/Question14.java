package curriculum11;

public class Question14 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                sum += i;
            }
        }

        System.out.println("1から100までの2または3の倍数の合計: " + sum);
    }
}
