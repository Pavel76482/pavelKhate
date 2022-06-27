package Lesson811;

public class Clinic1 {
    public Clinic1() {
    }


    public void findDoctor(Patient1 patient) {
        Doctor surgeon = new Doctor("surgeon");
        Doctor therapist = new Doctor("therapist");
        Doctor dentist = new Doctor("dentist");
        if (patient.getPlan1().getCode() == 1) {
            patient.getPlan1().setDoctor(surgeon);
            treat(patient.getPlan1().getCode(), patient.getPlan1().getDoctor());
        } else if (patient.getPlan1().getCode() == 2) {
            patient.getPlan1().setDoctor(dentist);
            treat(patient.getPlan1().getCode(), patient.getPlan1().getDoctor());
        } else {
            patient.getPlan1().setDoctor(therapist);
            treat(patient.getPlan1().getCode(), patient.getPlan1().getDoctor());
        }
    }
    public void treat(int code, Doctor vrach) {
        if (code == 1) {
            System.out.println("Le4it " + vrach.getProfession());
        } else if (code == 2) {
            System.out.println("Le4it " + vrach.getProfession());
        } else {
            System.out.println("Le4it " + vrach.getProfession());
        }
    }
}
