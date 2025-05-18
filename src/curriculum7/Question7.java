package curriculum7;

public class Question7 {
    public static void main(String[] args){
        int value = -5;

        if (value < 0) {
            throw new IllegalArgumentException("不正な引数です");
        }

        System.out.println("値は:" + value);
    }
}
