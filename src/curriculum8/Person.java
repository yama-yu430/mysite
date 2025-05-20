package curriculum8;

public class Person {
    private int age;

    public void setAge(int age){
        if (age < 18) {
            throw new IllegalArgumentException("年齢は１８歳以上でなければなりません。");
        }
        this.age = age;
    }
}
