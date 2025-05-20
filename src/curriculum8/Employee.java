package curriculum8;

public class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("給与は０以上でなければなりません。");
        }
        this.salary = salary;
    }
}
