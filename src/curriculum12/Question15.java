package curriculum12;

public class Question15 {
    public static void main(String[] args){
        String input = "13:45";
        String regex = "^([01]\\d|2[0-3]):[0-5]\\d$";

        if (input.matches(regex)) {
            System.out.println("有効な時刻形式です。");
        } else {
            System.out.println("無酷な時刻形式です。");
        }
    }
}
