package curriculum12;

public class Question7 {
    public static void main(String[] args){
        String input = "090-1234-5678";
        String regex = "^\\d{3}-\\d{4}-\\d{4}$";

        if (input.matches(regex)) {
            System.out.println("有効な郵便番号形式です。");
        } else {
            System.out.println("無効な郵便番号形式です。");
        }
    }
}
