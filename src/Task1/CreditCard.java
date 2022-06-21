package Task1;

public class CreditCard {
    private int number;
    private int sum;

    public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public CreditCard(int number, int sum) {
        this.number = number;
        this.sum = sum;
    }

    public CreditCard() {

    }
}
