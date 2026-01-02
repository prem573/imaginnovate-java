class Student {

    int admin_no;
    String stu_name;
    String course_joined;
    double fees_paid;

    final double JAVA_FEE = 10000;
    final double PYTHON_FEE = 7500;

    Student(int admin_no, String stu_name) {
        this.admin_no = admin_no;
        this.stu_name = stu_name;
        this.course_joined = "JAVA";
        this.fees_paid = 0;
    }

    Student(int admin_no, String stu_name, String course) {
        this.admin_no = admin_no;
        this.stu_name = stu_name;
        this.course_joined = course.toUpperCase();
        this.fees_paid = 0;
    }

    double getTotalFee() {
        if (course_joined.equals("JAVA"))
            return JAVA_FEE;
        else
            return PYTHON_FEE;
    }

    double getFeePaid() {
        return fees_paid;
    }

    double getDue() {
        return getTotalFee() - fees_paid;
    }

    void payment(double amount) {
        fees_paid += amount;
    }

    void display() {
        System.out.println("Admin No: " + admin_no);
        System.out.println("Name: " + stu_name);
        System.out.println("Course: " + course_joined);
        System.out.println("Total Fee: " + getTotalFee());
        System.out.println("Paid: " + fees_paid);
        System.out.println("Due: " + getDue());
        System.out.println("--------------------------");
    }
}

public class Fifteen {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Ravi");
        Student s2 = new Student(102, "Anita", "Python");

        s1.payment(3000);
        s2.payment(4000);

        s1.display();
        s2.display();
    }
}
