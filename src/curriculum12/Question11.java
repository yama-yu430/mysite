package curriculum12;

public class Question11 {
    public static void main(String[] args){
        String input = "192.168.1.1";
        String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}"
                + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

        if (input.matches(regex)) {
            System.out.println("有効なIPｖ４アドレスです。");
        } else {
            System.out.println("無効な（ＩＰｖ4アドレスです。");
        }
    }
}
