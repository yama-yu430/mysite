package curriculum13;

public class Question3 {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("1から100までの偶数の合計: " + sum);
    }
}
