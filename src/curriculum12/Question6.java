package curriculum12;

public class Question6 {
    public static void main(String[] args) {
        String input = "2024-10-24";
        String regex = "^\\d{4}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])$";

        if (input.matches(regex)) {
            System.out.println ("有効な日付形式（YYYY-MM-DD）です。");
        } else {
            System.out.println("無効な日付形式です。");
        }
    }
}