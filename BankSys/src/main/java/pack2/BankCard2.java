package pack2;

import pack1.Sum1;

public class BankCard2 {


    Sum1 sum = new Sum1(); // Composition
    long cardNumber;
    short expMonth;
    short expYear;

    public static void main(String[] args) {

       BankCard2 objB =new BankCard2();

       // Sum1 sum;


        objB.sum.currenCod = 1;
        objB.sum.sumMon = 3000000000L;

        objB.cardNumber = 1000000000000000l;
        objB.expMonth = 12;
        objB.expYear = 2017;


    }
}
