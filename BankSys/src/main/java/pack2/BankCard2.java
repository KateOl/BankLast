package pack2;

import pack1.Sum1;

public class BankCard2 {


    Sum1 sum;
    long cardNumber;
    short expMonth;
    short expYear;

    public static void main(String[] args) {

        BankCard2 objB =new BankCard2();

        objB.sum.currenCod = 1;
        objB.sum.sumMon = 3000000000l;

        objB.cardNumber = 1000000000000000l;
        objB.expMonth = 12;
        objB.expYear = 2017;



    }
}
