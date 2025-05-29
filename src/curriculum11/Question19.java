package curriculum11;

public class Question19 {
    public static void main(String[] args){
        int n = 10;
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
