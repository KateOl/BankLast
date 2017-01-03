package pack3;

import pack2.BankCard;
import pack2.Sum1;

public class Client {

    // Compositions
    Sum1 sum = new Sum1();
    Account acc1 = new Account();
    BankCard bankCard1 = new BankCard();

    // Variables

    private String surname;  // regarding to passport
    private String name; // regarding to passport
    private String middleName; // regarding to passport
    private String numPassport;

   // Gettery Settery

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

    //Constructors

    public  Client () {}

    public Client (String surnamePar, String namePar, String middleNamePar)
    {
                    this.surname = surnamePar;
                    this.name = namePar;
                    this.middleName = middleNamePar;
    }

    // main

    public static void main(String[] args) {

        Client objCl = new Client();



    }
}
