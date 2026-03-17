package se.lexicon;

public class Student {
    private final int studentId;
    private String name;
    private int age;
    private String major;

    public Student(int studentId, String name, int age, String major) {
        this.studentId = studentId;
        setName(name);
        setAge(age);
        setMajor(major);
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if (major != null && !major.isBlank()) {
            this.major = major;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }
}
