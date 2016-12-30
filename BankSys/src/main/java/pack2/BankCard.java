package pack2;

import pack1.Sum1;

public class BankCard {


    Sum1 sum = new Sum1(); // Composition
    private  long cardNumber;
    private short expMonth;
    private short expYear;
    private long x; // for test reason. Temperary. Will get Sum of Moneyfrom Sum1 class


    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpMonth(short expMonth) {
        this.expMonth = expMonth;
    }

    public void setExpYear(short expYear) {
        this.expYear = expYear;

    }

     public long getCardNumber() {
        return cardNumber;
    }

    public short getExpMonth() {
        return expMonth;
    }

    public short getExpYear() {
        return expYear;
    }

    public static void main(String[] args) {

       BankCard objB =new BankCard();

       // Sum1 sum;


         objB.sum.setSumMon(3000l);
         objB.sum.setCurrenCod((short) 1);



        objB.cardNumber = 1000000000000000l;
        objB.expMonth = 12;
        objB.expYear = 2017;

        objB.x = objB.sum.getSumMon();

        System.out.println(objB.x);


    }
}
