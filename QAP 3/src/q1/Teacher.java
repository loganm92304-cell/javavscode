/**
 * Represents a Teacher, extending Person with subject and salary.
 */
public class Teacher extends Person {
    private String subject; // e.g. "Computer Science", "Chemistry", "English", "Other"
    private double salary;  // Teacher's annual salary

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Getters and Setters
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: " + salary;
    }
}