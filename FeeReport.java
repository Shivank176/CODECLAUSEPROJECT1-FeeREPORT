
import java.util.ArrayList;

public class FeeReport {
    private ArrayList<Student> students;

    public FeeReport() {
        students = new ArrayList<>();
    }

    public void addStudent(String name) {
        students.add(new Student(name));
    }

    public Student findStudent(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public void payFees(String name, double amount) {
        Student student = findStudent(name);
        if (student != null) {
            student.payFees(amount);
            System.out.println("Payment successful!");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void generateReport() {
        System.out.println("\nFee Report:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}