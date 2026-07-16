/**
 * Represents a CollegeStudent, extending Student with year and major.
 */
public class CollegeStudent extends Student {
    private String major; // e.g. "Electrical Engineering", "Communications"
    private int year;     // Current level (1 = FROSH, 2 = SOPH, etc.)

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;
    }

    // Getters and Setters
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}