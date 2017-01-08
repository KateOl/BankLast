package pack1;

public class Less4_gr2 {


        int x=0;


        void met1(int xPar) {

            int x = 100;


            x = xPar;  //здесь изменяется поле х или локальная переменная?


            this.x = 1; //здесь изменяется поле х или локальная переменная?//Здесь поле х


            xPar = 2;   // изменяется ли здесь параметр xPar? // Да, станет 2

            System.out.println(xPar);


        }


        void met2(Less4_gr2 objPar){


        x=objPar.x; //здесь изменяется поле х или локальная переменная?

        //Здесь поле, т.к. локальная переменная прошлого блока, в этом блоке не видна


        this.x=1;   //здесь изменяется поле х или локальная переменная?//Здесь поле


        objPar.x=2;  //1. изменяется ли здесь параметр objPar?

        // Да, параметр objPar == 2

        //2. изменяется ли здесь поле  x// Да, поле х ==2

        }



        public static void main(String[]args){


        Less4_gr2 obj=new Less4_gr2();


            System.out.print("Локальная переменная мет1 = ");
           obj.met1(obj.x);

        System.out.println("1.obj.x="+obj.x);


        obj.met2(obj);

        System.out.println("2.obj.x="+obj.x);

            System.out.println("Поле х после всех изменений " + obj.x);
        }
        }
