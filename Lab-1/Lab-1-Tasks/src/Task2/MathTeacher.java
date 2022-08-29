package Task2;

import java.util.Scanner;

public class MathTeacher extends Teacher {
    private String field;
    private String courseName;
    private String designation;

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public MathTeacher(String name, int age, String institute, String field, String courseName,
            String designation) {
        super(name, age, institute);
        this.field = field;
        this.courseName = courseName;
        this.designation = designation;
    }

    public void displayTeacherDetails() {
        System.out.println("Teacher Details:");
        System.out.println("name = " + this.getName());
        System.out.println("age = " + this.getAge());
        System.out.println("institute = " + this.getInstitute());
        System.out.println("field = " + this.getField());
        System.out.println("institute = " + this.getCourseName());
        System.out.println("institute = " + this.getDesignation());
    }

    public static MathTeacher getHumanitiesTeacherData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        var name = scanner.next();
        System.out.println("Enter age ");
        var age = scanner.nextInt();
        System.out.println("Enter institute");
        var institute = scanner.next();
        System.out.println("Enter field");
        var field = scanner.next();
        System.out.println("Enter courseName");
        var courseName = scanner.next();
        System.out.println("Enter Designation");
        var designation = scanner.next();
        scanner.close();
        var mathTeacher = new MathTeacher(name, age, institute, field, courseName, designation);
        return mathTeacher;
    }
}