package pack3;


import pack2.Sum1;

public class Account {

    Sum1 sum = new Sum1(); // Composition

    private long acc;  // Account
    private long accNum; // Number of account
    private long x; // for Test reason. Temperary. Will get Sum of Moneyfrom Sum1 class


    public long getAcc() {
        return acc;
    }

    public long getAccNum() {
        return accNum;
    }


    public void setAcc(long acc) {
        this.acc = acc;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public Sum1 getSum() {
        return sum;
    }

    public void setSum(Sum1 sum) {
        this.sum = sum;
    }



    public Account() {
    }

    public Account(long accNumPar) {
        this.accNum = accNumPar;

    }

    public static void main(String[] args) {

        Account objAc = new Account();
        Account objAc1 = new Account(1234567890l);   // Set account number with the help of constructor
        Sum1 objCur = new Sum1(2); // set Currency code with the help of Constructor. See Sum1 class

        objAc.getSum().setSumMon(100000l);


        objAc.x = objAc.sum.getSumMon();


        System.out.println("Sum of money on the account " + objAc.x);
        System.out.println(objCur.getCurrenCod());


    }
}
