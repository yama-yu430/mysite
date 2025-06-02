package curriculum12;

public class Question12 {
    public static void main(String[] args){
        String input = "https://www.example.com";

        String regex = "^(http://|https://)"
                     +"([a-zA-Z0-9\\-]+\\.)+"
                     +"[a-zA-Z]{2,}$";

        if(input.matches(regex)) {
            System.out.println("有効なURLです。");
        } else {
            System.out.println("無効なURLです。");
        }
    }
}
