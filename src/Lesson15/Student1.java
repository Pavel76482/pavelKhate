package Lesson15;

public class Student1 {
    private String name;
    private double mark;
    private double course;

    public Student1(String name, double mark, double course) {
        this.name = name;
        this.mark = mark;
        this.course = course;
    }

    public Student1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getCourse() {
        return course;
    }

    public void setCourse(double course) {
        this.course = course;
    }
}