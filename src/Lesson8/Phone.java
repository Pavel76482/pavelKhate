package Lesson8;

public class Phone {
    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит"+ name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + " его номер " + number);
    }

     public void sendMessage(int number, int number1, int number2){
         System.out.println("Первый номер " + number + " второй номер " + number1 + " третий номер " +  number2);
     }


}
