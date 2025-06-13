class Emp {
    private int id = 200003;
    private String name = "Ramsingh Nayak";

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Employee {
    public static void main(String[] args) {
        Emp e = new Emp();
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
    }
}
