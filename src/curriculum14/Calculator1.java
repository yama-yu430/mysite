package curriculum14;

public class Calculator1 {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args){
        Calculator1 calc = new Calculator1();
        int result = calc.add(3, 5);
        System.out.println("結果: " + result);
    }
}
