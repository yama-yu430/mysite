package curriculum7;

public class Question8 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "orange"};
        try {
            System.out.println(fruits[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲外にアクセスしようとしました。");
        }
    }
}
