public class Arrayofobjects {
    public static void main(String[] args) {

        Employee[] e = new Employee[2];

        e[0] = new Employee("prem", 21);
        e[1] = new Employee("chand", 22);

        for (Employee emp : e) {
            emp.display();
        }
    }
}

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }
}
