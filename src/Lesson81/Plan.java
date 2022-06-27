package Lesson81;

public class Plan {
    int code;
    String doctor;

    public Plan(int code) {
        this.code = code;
    }

    public Plan() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Plan(String doctor) {
        this.doctor = doctor;
    }

    public Plan(int code, String doctor) {
        this.code = code;
        this.doctor = doctor;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void appDoctor(Plan ff) {
        if (ff.getCode() == 1) {
            System.out.println("Назначить врача " + getDoctor());


        }
    }
}
