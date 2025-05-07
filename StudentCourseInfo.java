import java.util.HashMap;
import java.util.Map;

public class StudentCourseInfo {
    private String studentName;
    private Map<String, Integer> courses;  // Map of courses and corresponding marks

    // Constructor
    public StudentCourseInfo(String studentName) {
        this.studentName = studentName;
        this.courses = new HashMap<>();
    }

    // Method to add course and marks
    public void addCourse(String courseName, int marks) {
        courses.put(courseName, marks);
    }

    // Method to display courses and marks
    public void displayCoursesInfo() {
        System.out.println("Courses and Marks for " + studentName + ":");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " marks");
        }
    }

    public static void main(String[] args) {
        // Example usage
        StudentCourseInfo studentCourses = new StudentCourseInfo("John Doe");
        studentCourses.addCourse("Math", 85);
        studentCourses.addCourse("Physics", 90);
        studentCourses.addCourse("Chemistry", 78);
        studentCourses.displayCoursesInfo();
    }
}
