package curriculum13;

public class Question2 {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }

        System.out.println("1から100までの合計は: " + sum);
    }
}
