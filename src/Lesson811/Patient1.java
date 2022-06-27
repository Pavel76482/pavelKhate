package Lesson811;

public class Patient1 {
    String name;
    Plan1 plan1;

    public Patient1(String name, Plan1 plan1) {
        this.name = name;
        this.plan1 = plan1;
    }

    public Plan1 getPlan1() {
        return plan1;
    }

    public void setPlan1(Plan1 plan1) {
        this.plan1 = plan1;
    }

    public Patient1(String name) {
        this.name = name;

    }

    public Patient1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    }




