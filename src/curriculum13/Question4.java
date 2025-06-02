package curriculum13;

public class Question4 {
    public static void main(String[] args){
        int i = 1;
        long product = 1;

        while (i <= 10) {
            product *= i;
            i++;
        }

        System.out.println("1から10までの積は: " + product);
    }
}
