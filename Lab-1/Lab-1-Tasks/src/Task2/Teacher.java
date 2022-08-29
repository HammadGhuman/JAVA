package Task2;

public class Teacher {
    private String name;
    private int age;
    private String institute;

    public String getName() {
        return this.name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInstitute() {
        return this.institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public Teacher(String Name, int age, String institute) {
        this.name = Name;
        this.age = age;
        this.institute = institute;
    }
}
