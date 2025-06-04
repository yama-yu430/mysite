package curriculum14;

public class StringUtils4 {
    public boolean containsChar(String input, char c) {
        return input.indexOf(c) >= 0;
    }

    public static void main(String[] args) {
        StringUtils4 utils = new StringUtils4();

        System.out.println(utils.containsChar("apple" , 'p'));
        System.out.println(utils.containsChar("banana", 'z'));
        System.out.println(utils.containsChar("", 'a'));
    }
}
