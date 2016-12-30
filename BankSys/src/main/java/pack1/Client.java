package pack1;

import pack2.BankCard;

public class Client {

    Sum1 sum = new Sum1();
    Account acc1 = new Account();
    BankCard bankCard1 = new BankCard();

    private String surname;  // regarding to passport
    private String name; // regarding to passport
    private String middleName; // regarding to passport
    private String numPassport;



    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setNumPassport(String numPassport) {
        this.numPassport = numPassport;
    }

    public static void main(String[] args) {

        Client objCl = new Client();



    }
}
