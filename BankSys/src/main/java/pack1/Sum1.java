package pack1;



public class Sum1 {

    private long sumMon;
    private short currenCod;

    public void setSumMon(long sumMon) {
        this.sumMon = sumMon;
    }

    public void setCurrenCod(short currenCod) {
        this.currenCod = currenCod;
    }

    public long getSumMon() {
        return sumMon;
    }

    public short getCurrenCod() {
        return currenCod;
    }

    public static void main(String[] args) {

        Sum1 objSum = new Sum1();

        objSum.setSumMon(7000l);
        objSum.setCurrenCod((short) 1);


    } //main
} // class
