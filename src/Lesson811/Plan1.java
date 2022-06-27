package Lesson811;

public class Plan1 {
int code;
Doctor doctor;

    public Plan1(int code, Doctor doctor) {
        this.code = code;
        this.doctor = doctor;
    }

    public Plan1(int code) {
        this.code = code;
    }

    public Plan1() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


}
