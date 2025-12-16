public class DepartmentFinder {
    public static Department find(int departmentNumber) {
        // Mock data - replace with database lookup if needed
        switch (departmentNumber) {
            case 10:
                return new Department(10, "Engineering");
            case 20:
                return new Department(20, "Sales");
            case 30:
                return new Department(30, "HR");
            default:
                return new Department(departmentNumber, "Unknown");
        }
    }
}