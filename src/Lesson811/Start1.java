package Lesson811;

import Lesson81.Clinic;

public class Start1 {
    public static void main(String[] args) {
        Patient1 viktor = new Patient1("Viktor");
        Patient1 vasya = new Patient1("Vasilii");
        Patient1 jora = new Patient1("Jorik");

        Plan1 plan1 = new Plan1(1);
        Plan1 plan2 = new Plan1(2);
        Plan1 plan3 = new Plan1(3);

        viktor.setPlan1(plan1);
        vasya.setPlan1(plan2);
        jora.setPlan1(plan3);

        Clinic1 clinic = new Clinic1();
        clinic.findDoctor(viktor);
        clinic.findDoctor(vasya);
        clinic.findDoctor(jora);
    }
}
