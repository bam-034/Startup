package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Developer dev1 = new Developer("Korn", 40000, 10, 500, 12, 1000);
        CEO ceo1 = new CEO("Bill", 100000, 2, 500, 5, 10000);
        Marketing marketing1 = new Marketing("Sara", 25000, 12, 500, 2, 1000);
        Driver dri1 = new Driver("John", 6, 800);
        Cleaner cle1 = new Cleaner("Boon", 15, 350);
        Rental ren1 = new Rental (30,15000);
        Electricity ele1 = new Electricity(20,20000);
        Internet in1 = new Internet(30,20000);

        int totalPayment = 0;

        ArrayList<Payment> pays = new ArrayList<Payment>();
        pays.add(dev1);
        pays.add(ceo1);
        pays.add(marketing1);
        pays.add(dri1);
        pays.add(cle1);
        pays.add(ren1);
        pays.add(ele1);
        pays.add(in1);
        for (Payment payments : pays) {
            int payment = payments.getPayment();
            System.out.println(payments.getName() + " Payment: " + payment);
            totalPayment += payment;
        }
        System.out.println("Total Payment: " + totalPayment);
    }
}
