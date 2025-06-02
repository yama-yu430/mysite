package curriculum12;

public class Question13 {
    public static void main(String[] args){
        String input = "123456789X";

        if (!input.matches("^\\d{9}[\\dx]$")) {
            System.out.println("無効なISBN-10形式です。");
            return;
        }
        int sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum += (input.charAt(i) - '0') * (i + 1);
        }

        char checkChar = input.charAt(9);
        int checkValue = (checkChar == 'X') ? 10 : (checkChar - '0');
        sum += checkValue * 10;

        if (sum % 11 == 0) {
            System.out.println("有効なISBN-10です。");
        } else {
            System.out.println("無効なISBN-10です。");
        }
    }
}
