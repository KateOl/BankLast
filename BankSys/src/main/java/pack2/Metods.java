package pack2;

public class Metods {

    private int x;   //поле класса
    private int y;   //поле класса

    public Metods() {
    }

    public Metods(int xPar) {

        System.out.println("lksjfhgldsfkjghkljsghl");

    }

    private void met1() {

        int x = 0;     //локал переменная х- этого метода
        int local;

        local = 7;

        y = 0;
        y = local;
        x = 7;                    //запись в локал. переменную х
        this.x = 17;        //запись в поле класса

        this.y = 100;
        this.x = 1000;

        Metods obj = new Metods();
        obj.x = 10000;
        obj.y = 10000;
    }

    public int met1(int xPar, Metods objPar) {  //если метод возвращ значение,сразу начинает подчеркиваться - надо использовать оператор ретурн
        int x; //локал переменная х- этого метода
        short sh;

        x = xPar;
        sh = (short) xPar;
        xPar = 7;

        objPar.x = 7;
        objPar.y = 17;

        return xPar;
    }

    void met2() {
        met1();
        this.met1();

        Metods obj = new Metods();
        met1(100, obj);

        met1(100, new Metods());

    }

    public static void main(String[] args) {

        Metods obj = new Metods();
        obj.met1();

        obj.met1(10, obj);
        obj.met1(100, new Metods());

        Metods obj3 = new Metods();
        int xx = 1000;

        obj.met1(xx, obj3);

        obj.met2();
        obj3.met2();

    }  //main

} //class Public

