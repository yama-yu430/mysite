package curriculum12;

public class Question14 {
    public static void main(String[] args){
        String password = "Avxdef1!";

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[^a-zA-Z0-9]).{8,}$";

        if (password.matches(regex)) {
            System.out.println("パスワードは有効です。");
        } else {
            System.out.println("パスワードは無効です。");
        }
    }
}
