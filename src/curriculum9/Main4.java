package curriculum9;

class Person {
    String name;
    int age;
}

class Student extends Person {
    int studentId;

    void study() {
        System.out.println(name + " is studying. Student ID:" + studentId);
    }
}

public class Main4 {
    public static void main(String[] args){
        Student student = new Student();
        student.name = "Yamada";
        student.age = 20;
        student.studentId = 12345;
        student.study();
    }
}