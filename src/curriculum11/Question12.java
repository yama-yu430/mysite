package curriculum11;

public class Question12 {
    public static void main(String[] args){
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("偶数の合計: " + evenSum);
        System.out.println("奇数の合計: " + oddSum);
    }
}
