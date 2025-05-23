package curriculum9;

class Shape {
    String color;
}

class Circle extends Shape {
    double radius;

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main3 {
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.color = "Red";
        circle.radius = 5.0;

        double area = circle.calculateArea();
        System.out.println("Color: " + circle.color);
        System.out.println("Area: " + area);

    }
}