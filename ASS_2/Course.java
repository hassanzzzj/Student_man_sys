package ASS_2;


public class Course {
    private String courseId;
    private String courseName;
    private String creditHours;

    public Course(String courseId, String courseName, String creditHours) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCreditHours() {
        return creditHours;
    }
}
