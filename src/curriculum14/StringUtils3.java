package curriculum14;

public class StringUtils3 {
    public int getLength(String input) {
        return input == null ? 0 : input.length();
    }

    public static void main(String[] args) {
        StringUtils3 utils = new StringUtils3();

        String[] testCases = {null, "", "Hello", "こんにちは", " "};

        for (String s : testCases) {
            System.out.println("入力：　\"" + s + "\" の長さ" + utils.getLength(s));
        }
    }
}
