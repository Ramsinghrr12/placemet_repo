class Employee{
    String name;
    int id;
    double salary;

    Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display(){
          System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        


    }
}
class Manager extends Employee{
String department;
Manager(String name, int empId, double salary, String department) {
        super(name, empId, salary); // Call the parent class constructor
        this.department = department;
    }
     void displayManagerDetails() {
        display(); // Call base class method
        System.out.println("Department: " + department);
    }
}
class company{
    public static void main(String[] args) {
        Manager m=new Manager("Ramsingh", 200001, 990000.0,"SDE");
        m.displayManagerDetails();
    }
}