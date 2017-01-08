package pack2;

import pack2.Sum1;

public class BankCard {

    // Composition
    Sum1 sum = new Sum1();

    // Variables
    private  long cardNumber;
    private short expMonth;
    private short expYear;
    private int cVV;
    private long x; // for Test reason. Temperary. Will get Sum of Moneyfrom Sum1 class

   // Gettery Settery
    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpMonth(short expMonth) {
        this.expMonth = expMonth;
    }

    public void setExpYear(short expYear) {
        this.expYear = expYear;

    }

    public void setcVV(int cVV) {
        this.cVV = cVV;
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

    public long getcVV() {
        return cVV;
    }

    // Constructors

        public BankCard () {}  // by default

       public BankCard (long cardNumberPar, int cVVPar, int expMonthPar, int expYearPar){

        this.cardNumber = cardNumberPar;
        this.cVV = cVVPar;
        this.expMonth =(short) expMonthPar;
        this.expYear = (short) expYearPar;
        this.sum = new Sum1();

    }

    public static void main(String[] args) {

       BankCard objB =new BankCard();
       BankCard constrSParam =new BankCard(1234567812345678l, 123, 10, 2017);
        Sum1 objCur = new Sum1 (0);
        Sum1 objSum = new Sum1(1000l);



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
