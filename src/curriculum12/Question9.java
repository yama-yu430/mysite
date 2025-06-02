package curriculum12;

public class Question9 {
    public static void main(String[] args){
        String input = "Hello World";
        String regex = "^[A-Za-z]+\\s+[A-Za-z]+$";

        if (input.matches(regex)) {
            System.out.println("有効な形式です（アルファベット + 空白 + アルファベット）。");
        } else {
            System.out.println("無効な形式です。");
        }
    }
}
