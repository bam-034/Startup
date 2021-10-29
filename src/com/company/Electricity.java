package com.company;

public class Electricity implements Payment{
    private String name;
    private int unit;
    private int rate;

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String getName() {
        return this.name = "Electricity";
    }

    public Electricity(int unit, int rate) {
        this.unit = unit;
        this.rate = rate;
    }

    @Override
    public int getPayment() {
        int payment = this.unit * this.rate;
        return payment;
    }
}
