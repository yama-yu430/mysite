package curriculum12;

public class Question3 {
    public static void main(String[] args){
        String email = "test@example.com";
        String regex = "^[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$";

        if (email.matches(regex)) {
            System.out.println("有効なメールアドレス形式です。");
        } else {
            System.out.println("無効なメールアドレス形式です。");
        }
    }
}
