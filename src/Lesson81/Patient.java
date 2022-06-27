package Lesson81;

public class Patient {
    String name;
    Plan plan;

    public Patient(String name) {
        this.name = name;
    }

    public Patient() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Patient(String name, Plan plan) {
        this.name = name;
        this.plan = plan;
    }
}
