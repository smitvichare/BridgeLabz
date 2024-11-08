package org.example;

public class Main {
    public static void main(String[] args) {

        bankSys b=new bankSys();
        b.createTable();
        b.createBank(new Bank(1,"sam",600));
        b.createBank(new Bank(2,"karl",800));
        b.createBank(new Bank(3,"prince",400));
        b.readBank();
        b.transaction(1,3,20);
        b.readBank();
    }
}