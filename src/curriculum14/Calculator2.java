package curriculum14;

public class Calculator2 {
    public int subtract (int a, int b){
        return a - b;
    }

    public static void main(String[] args){
        Calculator2 calc = new Calculator2();
        int result = calc.subtract(10, 5);
        System.out.println("結果: " + result);
    }
}
