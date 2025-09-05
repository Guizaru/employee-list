package entities;

public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double percentage){
        salary += salary * percentage / 100.00;
    }
    public String toString() {
        return
                id + "," + " " + name + "," + " " + String.format("%.2f",salary);
    }
}
