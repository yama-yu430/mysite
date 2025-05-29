package curriculum11;

public class Question16 {
    public static void main(String[] args){
        int[] numbers = {2, 5, 8, 11, 14, 17, 20};
        int sum = 0;

        for (int num : numbers) {
            if (num % 2 != 0) {
                sum += num;
            }
        }

        System.out.println("奇数の合計: " + sum);
    }
}
