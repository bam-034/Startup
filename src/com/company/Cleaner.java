package com.company;

public class Cleaner implements Payment{
    private String name;
    private int DayOfWork;
    private int rate;

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDayOfWork() {
        return DayOfWork;
    }

    public void setDayOfWork(int dayOfWork) {
        DayOfWork = dayOfWork;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public Cleaner(String name, int dayOfWork, int rate) {
        this.name = name;
        DayOfWork = dayOfWork;
        this.rate = rate;
    }

    @Override
    public int getPayment(){
        int payment = this.DayOfWork * this.rate;
        System.out.println("Cleaner payment: " + payment);
        return payment;
    }
}
