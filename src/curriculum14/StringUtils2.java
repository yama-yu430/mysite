package curriculum14;

public class StringUtils2 {
    public boolean isEmpty(String input) {
        return input == null || input.isEmpty();
    }

    public static void main(String[] args) {
        StringUtils2 utils = new StringUtils2();

        String[] testStrings = {null, "", " ", "Hello"," "};

        for (String s : testStrings) {
            System.out.println("入力: \"" + s + "\" は空？　→　" + utils.isEmpty(s));
        }
    }
}
