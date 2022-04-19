package mainchild;

public class Employee extends Person {
    
    private double salary;
    private double rate;
    public Employee(){}
    
    
    public Employee(String name, int age, String address, double salary, double rate){
        this.salary = salary;
        this.rate = rate;
    }
}
