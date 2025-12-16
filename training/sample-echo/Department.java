import java.util.ArrayList;
import java.util.List;

public class Department {
    private int departmentNumber;
    private String departmentName;
    private List<Employee> employeeList;

    public Department(int departmentNumber, String departmentName) {
        this.departmentNumber = departmentNumber;
        this.departmentName = departmentName;
        this.employeeList = new ArrayList<>();
    }

    public void assignEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}