package pack1;

public class Bankomat {

    Sum1 sum = new Sum1(); // Composition
    private int num; // Number of Bancomat
    private String numInv; // Inventar number of Bancomat
    private long x; // for test reason. Temperary. Will get Sum of Moneyfrom Sum1 class

    public void setNum(int num) {
        this.num = num;
    }

    public void setNumInv(String numInv) {
        this.numInv = numInv;
    }

    public static void main(String[] args) {


        Bankomat objBa = new Bankomat();

        objBa.sum.setSumMon(50000l);
        objBa.sum.setCurrenCod((short) -2);

        objBa.x = objBa.sum.getSumMon();

        System.out.println(objBa.x);

    }
}
