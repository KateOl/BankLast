package pack3;

//Due to composition field

import pack2.Sum1;

import java.awt.image.BandCombineOp;

public class Bankomat {


     // Composition
    private Sum1 sum = new Sum1();

    // Variables
    private int num; // Number of Bancomat
    private String numInv; // Inventar number of Bancomat
    private String addr;
    private long x; // for Test reason. Temperary. Will get Sum of Moneyfrom Sum1 class


    // Gettery Settery

    public void setNum(int num) {
        this.num = num;
    }

    public void setNumInv(String numInv) {
        this.numInv = numInv;
    }

    public Sum1 getSum() {
        return sum;
    }

    public void setSum(Sum1 sum) {
        this.sum = sum;
    }


    // Constructors

    Bankomat () {} // Constructor by default

    Bankomat(int numPar, String addrPar, long sumMonPar, short currenCodPar) {
        this.num = numPar;
        this.addr = addrPar;
        this.numInv = "";
        this.sum = new Sum1(sumMonPar, currenCodPar);
    }

    @Override
    public String toString() {
        return "Bankomat{" +
                "sum=" + sum +
                ", num=" + num +
                ", numInv='" + numInv + '\'' +
                ", addr='" + addr + '\'' +
                ", x=" + x +
                '}';
    }

    public static void main(String[] args) {


        Bankomat bankomat = new Bankomat();
        Bankomat bankomat2 = new Bankomat(1, "Pushkinskaya", 10000l,(short) 1);

       // bankomat2.setSum(sum);
       //bankomat2.setSum(sum1);




       // bankomat.getSum().setSumMon(50000l);
       // bankomat.getSum().setCurrenCod((short) -2);

        bankomat.x = bankomat.getSum().getSumMon();

        System.out.println(bankomat2);

    }
}
