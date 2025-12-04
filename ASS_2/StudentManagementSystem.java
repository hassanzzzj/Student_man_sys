package ASS_2;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
        private List<Student> students = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

    public void addCourse(String id, String name, String ch) {
        courses.add(new Course(id, name, ch));
        System.out.println("Course added successfully!");
    }

    public void addStudent(String id, String name) {
        students.add(new Student(id, name));
        System.out.println("Student added successfully!");
    }

    public void enrollStudent(String studentId, String courseId) {
        Student s = null;
        Course c = null;

        for (Student st : students) {
            if (st.getStudentId().equals(studentId)) {
                s = st;
                break;
            }
        }

        for (Course cs : courses) {
            if (cs.getCourseId().equals(courseId)) {
                c = cs;
                break;
            }
        }

        if (s != null && c != null) {
            s.enrollCourse(c);
            System.out.println("Enrollment successful!");
        } else {
            System.out.println("Student or Course not found!");
        }
    }

    public void showAllStudents() {
        System.out.println("\n===== ALL STUDENTS =====");
        for (Student s : students) {
            s.showInfo();
        }
    }

}
