package com.company;

public class Internet implements Payment{
    private String name;
    private int monthlySub;
    private int subRate;

    public int getMonthlySub() {
        return monthlySub;
    }

    public void setMonthlySub(int monthlySub) {
        this.monthlySub = monthlySub;
    }

    public int getSubRate() {
        return subRate;
    }

    public void setSubRate(int subRate) {
        this.subRate = subRate;
    }

    public Internet(int monthlySub, int subRate) {
        this.monthlySub = monthlySub;
        this.subRate = subRate;
    }

    @Override
    public String getName() {
        return this.name = "Internet Access";
    }

    @Override
    public int getPayment() {
        int payment = this.monthlySub * this.subRate;
        return payment;
    }
}
