package curriculum14;

public class StringUtils1 {
    public String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public static void main(String[] args){
        StringUtils1 utils = new StringUtils1();
        String result = utils.toUpperCase("hello world");
        System.out.println("大文字変換結果: " + result);
    }
}
