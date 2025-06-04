package curriculum14;

public class NumberUtils {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args){
        NumberUtils utils = new NumberUtils();

        int[] testNumbers = {1, 2, 3, 4, 5, 10, 13};

        for (int num : testNumbers) {
            System.out.println(num + "は偶数ですか？ " + utils.isEven(num));
        }
    }
}
