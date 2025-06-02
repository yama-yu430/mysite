package curriculum12;

public class Question16 {
    public static void main(String[] args){
        String[][] array = { {"Hello", "World"},{"Java", "Regex"} };
        String regex = "^[A-Za-z]+$";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String value = array[i][j];
                if (value.matches(regex)) {
                    System.out.println("\"" + value + "\" はアルファベットのみで構成されています。");
                } else {
                    System.out.println("\"" + value + "\" はアルファベットのみではありません。" );
                }
            }
        }
    }
}
