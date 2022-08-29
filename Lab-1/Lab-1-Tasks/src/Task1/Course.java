package Task1;

public class Course {
    private String courseName;
    private double obtainedMarks;

    public Course(String courseName, double obtainedMarks) {
        this.courseName = courseName;
        this.obtainedMarks = obtainedMarks;
    }

    public Course() {

    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setObtainMarks(double obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public double getObtainedMarks() {
        return this.obtainedMarks;
    }
}
