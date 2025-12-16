public class Prem {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Employee newEmployee = new Employee();
        int departmentNumber = 10; // example value

        Department aDept = DepartmentFinder.find(departmentNumber);
        aDept.assignEmployee(newEmployee);

        System.out.println(aDept.getEmployeeList());
    }
}
