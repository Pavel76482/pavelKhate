package Task1;

import Task1.CreditCard;

public class OOP1 {
    public static void main(String[] args) {

       CreditCard masterCard = new CreditCard(12345, 100);
       CreditCard masterCard1 = new CreditCard();


       int result = masterCard.getSum() + 50;
       masterCard.setSum(result);

       Operation operation = new Operation();
       operation.deposite(masterCard, 200);
       operation.minus(masterCard, 15);

       System.out.println(masterCard.getSum());

       operation.showInfo(masterCard);
  // 1.3) Создать 3 карты. В двух прибавить, в третьей отнять.
       CreditCard visa1 = new CreditCard(345, 1000);
       CreditCard visa2 = new CreditCard(445, 2000);
       CreditCard visa3 = new CreditCard(550, 3000);

        operation.deposite(visa1, 100);
        operation.deposite(visa2, 200);
        operation.minus(visa3, 250);
        operation.showInfo(visa1);
        operation.showInfo(visa2);
        operation.showInfo(visa3);

        CreditCard taxiCard = new CreditCard(777, 7200);
        operation.deposite(taxiCard, 300);
        operation.showInfo(taxiCard);

    }
}
