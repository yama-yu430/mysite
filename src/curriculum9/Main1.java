package curriculum9;

class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("にゃーん");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.name = "たま";
        myCat.eat();
        myCat.meow();
    }
}