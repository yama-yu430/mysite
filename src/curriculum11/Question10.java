package curriculum11;

public class Question10 {
    public static void main(String[] args){
        int[] numbers = {2, 5, 8, 11, 14, 17, 20};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("配列の合計：" + sum);
    }
}
