package com.company;

public class Rental implements Payment{
    private String name;
    private int monthlyRental;
    private int rentalRate;

    public int getMonthlyRental() {
        return monthlyRental;
    }

    public void setMonthlyRental(int monthlyRental) {
        this.monthlyRental = monthlyRental;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }

    @Override
    public String getName() {
        return this.name = "Rental";
    }

    public Rental(int monthlyRental, int rentalRate) {
        this.monthlyRental = monthlyRental;
        this.rentalRate = rentalRate;
    }

    @Override
    public int getPayment() {
        int payment = this.monthlyRental * this.rentalRate;
        return payment;
    }
}
