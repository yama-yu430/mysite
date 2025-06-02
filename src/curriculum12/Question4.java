package curriculum12;

public class Question4 {
    public static void main(String[] args){
        String input = "1234567";
        String regex = "^\\d{5}(\\d{2})?$";

        if (input.matches(regex)) {
            System.out.println("有効な郵便番号です。");
        } else {
            System.out.println("無効な郵便番号です。");
        }
    }
}
