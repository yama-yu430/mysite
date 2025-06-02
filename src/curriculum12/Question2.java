package curriculum12;

public class Question2 {
    public static void main(String[] args){
        String input = "Hello";
        String regex = "^[A-Za-z]+$";

        if (input.matches(regex)) {
            System.out.println("アルファベットのみで構成されています。");
        } else {
            System.out.println("アルファベット以外の文字が含まれています。");
        }
    }
}
