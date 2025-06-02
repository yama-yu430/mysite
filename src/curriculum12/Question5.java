package curriculum12;

public class Question5 {
    public static void main(String[] args){
        String input = "1234567812345678";
        String regex = "^\\d{16}$";

        if (input.matches(regex)) {
            System.out.println("有効なクレジットカード番号形式です。");
        } else {
            System.out.println("無効なクレジットカード番号形式です。");
        }
    }
}
