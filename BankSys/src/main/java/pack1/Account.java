package pack1;


public class Account {

    Sum1 sum = new Sum1(); // Composition

    private long acc;  // Account
    private long accNum; // Number of account
    private long x; // for test reason. Temperary. Will get Sum of Moneyfrom Sum1 class


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

    public static void main(String[] args) {

        Account objAc = new Account();

        objAc.sum.setSumMon(100000l);
        objAc.sum.setCurrenCod((short) 3);

        objAc.x = objAc.sum.getSumMon();


        System.out.println("Summ of money on the account" + objAc.x);



    }
}
