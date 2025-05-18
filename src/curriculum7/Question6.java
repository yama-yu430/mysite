package curriculum7;

public class Question6 {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("結果：" + result);
        } finally {
            System.out.println("エラーが発生しました");
        }
    }
}