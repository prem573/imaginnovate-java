class Employee {
    int emp_id;
    String name;

    Employee(int id, String name) {
        this.emp_id = id;
        this.name = name;
    }
}

class FactoryEmployee extends Employee {
    int bus_no;
    String boards;

    FactoryEmployee(int id, String name, int bus_no, String boards) {
        super(id, name);
        this.bus_no = bus_no;
        this.boards = boards;
    }

    void display() {
        System.out.println("ID: " + emp_id);
        System.out.println("Name: " + name);
        System.out.println("Bus No: " + bus_no);
        System.out.println("Boards: " + boards);
    }
}

public class Sixteen {
    public static void main(String[] args) {
        FactoryEmployee f = new FactoryEmployee(101, "Ravi", 12, "Yes");
        f.display();
    }
}
