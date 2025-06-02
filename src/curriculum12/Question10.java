package curriculum12;

public class Question10 {
    public static void main(String[] args){
        String input = "12345-abcXYZ";
        String regex = "^\\d{5}.*$";

        if (input.matches(regex)) {
            System.out.println("有効な形式です（5桁の数字で始まっています）。");
        } else {
            System.out.println("無効な形式です。");
        }
    }
}
