package curriculum7;

public class Question9 {
    public static void main(String[] args){
        String[] fruits = {"Apple","Banana"};
        String fruit = null;

        try {
            System.out.println(fruits[2]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("配列の外を見ようとしました。");
        }

        try {
            System.out.println(fruit.length());
        } catch (NullPointerException e) {
            System.out.println("nullの変数にアクセスしました。");
        }
    }
}
