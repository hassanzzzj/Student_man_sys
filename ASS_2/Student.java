package ASS_2;

import java.util.ArrayList;
import java.util.List;

public class Student {
       private String studentId;
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }

    public String getStudentId() {
        return studentId;
    }

    public void showInfo() {
        System.out.println("\nStudent ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Enrolled Courses:");
        for (Course c : courses) {
            System.out.println("  - " + c.getCourseId() + " | " + c.getCourseName() + " (" + c.getCreditHours() + " CH)");
        }
    }
}
