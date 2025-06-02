package curriculum12;

public class Question1 {
    public static void main(String[] args){
        String input = "123456";
        String regex = "\\d+";

        if (input.matches(regex)) {
            System.out.println("数字のみで構成されています。");
        } else {
            System.out.println("数字以外の文字が含まれています。");
        }
    }
}
