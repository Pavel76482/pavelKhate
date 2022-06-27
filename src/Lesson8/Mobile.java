package Lesson8;

public class Mobile {
    public static void main(String[] args) {
        Phone motorolla = new Phone(2020327, "mpx220", 500);
        Phone nokia = new Phone(10020030, "3310", 700);
        Phone siemens = new Phone(90030023, "A50", 800);

        System.out.println(motorolla.number + " " + motorolla.model + " " + motorolla.weight);
        System.out.println(nokia.number + " " + nokia.model + " " + nokia.weight);
        System.out.println(siemens.number + " " + siemens.model + " " + siemens.weight);

        motorolla.receiveCall("vitya");
        System.out.println(motorolla.getNumber());

        motorolla.sendMessage(3454366, 435656, 564567);



    }
}
