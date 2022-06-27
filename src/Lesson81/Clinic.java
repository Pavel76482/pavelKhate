package Lesson81;

public class Clinic {
    String surgeon;
    String therapist;
    String dentist;

    public Clinic(String surgeon, String therapist, String dentist) {
        this.surgeon = surgeon;
        this.therapist = therapist;
        this.dentist = dentist;
    }

    public Clinic() {
    }

    public String getSurgeon() {
        return surgeon;
    }

    public void setSurgeon(String surgeon) {
        this.surgeon = surgeon;
    }

    public String getTherapist() {
        return therapist;
    }

    public void setTherapist(String therapist) {
        this.therapist = therapist;
    }

    public String getDentist() {
        return dentist;
    }

    public void setDentist(String dentist) {
        this.dentist = dentist;
    }

    public void treat(Patient bolnoi) {
        if (bolnoi.getPlan().getCode() == 1) {
            System.out.println("оперирует");
        } else if (bolnoi.getPlan().getCode() == 2) {
            System.out.println("отправляет на больничный");
        } else if (bolnoi.getPlan().getCode() == 3) {
            System.out.println("лечит зубы");
        } else {
            System.out.println("нужно другое лечение");
        }


    }
}
