package curriculum11;

public class Question13 {
    public static void main(String[] args){
        int[] numbers = {4, 7, 10, 13, 16, 19, 22};

        System.out.println("偶数の値: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
