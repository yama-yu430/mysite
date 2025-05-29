package curriculum11;

public class Question15 {
    public static void main(String[] args){
        int[] numbers = {3, 6, 9, 12, 15};
        int product = 1;

        for (int num : numbers) {
            product *= num;
        }

        System.out.println("配列のすべての要素をかけ合わせた結果:" + product);
    }
}
