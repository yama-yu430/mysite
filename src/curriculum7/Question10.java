package curriculum7;

public class Question10 {
    public static void main(String[] args){
        try {
            throw new MyCustomException("カスタム例外が発生しました。");
        } catch (MyCustomException e) {
            System.out.println("キャッチ:" + e.getMessage());
        }
    }
}
