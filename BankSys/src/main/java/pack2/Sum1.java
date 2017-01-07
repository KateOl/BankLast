package pack2;


public class Sum1 {

    private long sumMon;
    private short currenCod;

    public void setSumMon(long sumMon) {
        this.sumMon = sumMon;
    }

    public void setCurrenCod(int currenCod) {
        this.currenCod = (short) currenCod;
    }

    public long getSumMon() {
        return sumMon;
    }

    public short getCurrenCod() {
        return currenCod;
    }

    // Constructar

    public Sum1 ()
    {
        this.currenCod = 0;
        this.sumMon = 0;
    }


    public Sum1(int currenCodPar) {

            this.currenCod = (short) currenCodPar;
    }


    public Sum1(long sumMonPar) {

        this.sumMon= sumMonPar;
    }

    public  Sum1 (long sumMonPar,short currenCodPar)
    {
        this.sumMon = sumMonPar;
        this.currenCod = currenCodPar;

    }


    public static void main(String[] args) {

        Sum1 objSum = new Sum1();
        Sum1 objCur = new Sum1 (3);
        //objCur.setCurrenCod(3);

        objSum.setSumMon(7000l);
        objSum.setCurrenCod((short) 1);


    } //main
} // class
