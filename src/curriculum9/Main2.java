package curriculum9;

class Employee {
    String name;
    int id;
}

class Manager extends Employee {
    int teamSize;

    void manageTeam() {
        System.out.println(name + " is maneging a team of " + teamSize + " people.");
    }
}

public class Main2 {
    public static void main(String[] args){
        Manager manager = new Manager();
        manager.name = "Tanaka";
        manager.id = 101;
        manager.teamSize = 5;

        manager.manageTeam();
    }
}