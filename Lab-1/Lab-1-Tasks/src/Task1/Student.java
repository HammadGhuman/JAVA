package Task1;

import java.util.Scanner;

public class Student {
    private String name;
    private String _id;
    private String departmentName;
    private Course[] course;
    private int totalMarks;

    public Student() {

    }

    public Student(String name, String _id, String departmentName, int totalMarks, Course[] course) {
        this.totalMarks = totalMarks;
        this.course = course;
        this._id = _id;
        this.name = name;
        this.departmentName = departmentName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public void setId(String id) {
        this._id = id;
    }

    public String getId() {
        return this._id;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setCourse(Course course[]) {
        this.course = course;
    }

    public Course[] getCourse() {
        return this.course;
    }

    public double calculatePercentage() {
        double sum = 0;
        for (Course c : this.course) {
            sum += c.getObtainedMarks();
        }
        return (sum / totalMarks) * 100;
    }

    public String calculateGrade() {
        double percentage = calculatePercentage();
        if (percentage < 50) {
            return "Failed F";
        } else if (percentage > 50 && percentage < 60) {
            return "Passed With D";
        } else if (percentage > 60 && percentage < 70) {
            return "Passed With C";
        } else if (percentage > 70 && percentage < 80) {
            return "Passed With B";
        } else if (percentage > 80 && percentage < 90) {
            return "Passed With A";
        } else {
            return "Passed with A+";
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student Details");
        System.out.println("Student Name :" + getName());
        System.out.println("Student Id :" + getId());
        System.out.println("Student Department :" + getDepartmentName());
        for (Course c : this.course) {
            System.out.println("Obtained " + c.getObtainedMarks() + " from " + "100 in" +
                    c.getCourseName());
        }
        System.out.println("Percentage " + this.calculatePercentage());
        System.out.println("Grade " + this.calculateGrade());

    }

    public static Student getStudentDetail() {
        Course courses[] = new Course[6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name");
        var name = scanner.next();
        System.out.println("Enter you ID");
        var id = scanner.next();
        System.out.println("Enter your Department Name");
        var dep = scanner.next();
        for (var i = 0; i < 6; i++) {
            System.out.println("Enter The Course " + (i + 1) + " Name");
            var courseName = scanner.next();
            System.out.println("Enter The Obtained marks of Course " + (i + 1));
            var marks = scanner.nextDouble();
            courses[i] = new Course(courseName, marks);
        }
        Student student = new Student(name, id, dep, 600, courses);
        scanner.close();
        return student;
    }
}
