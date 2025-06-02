package curriculum12;

public class Question8 {
    public static void main(String[] args){
        String input = "https://example.com";
        String regex = "^https?://.*\\.com$";

        if (input.matches(regex)){
            System.out.println("有効なURL形式です。");
        } else {
            System.out.println("無効なURL形式です。");
        }
    }
}
