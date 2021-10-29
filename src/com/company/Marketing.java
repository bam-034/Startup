package com.company;

public class Marketing extends Staff{

    private int extraLanguage;
    private int extraLanguageRate;

    public int getExtraLanguage() {
        return extraLanguage;
    }

    public void setExtraLanguage(int extraLanguage) {
        this.extraLanguage = extraLanguage;
    }

    public int getExtraLanguageRate() {
        return extraLanguageRate;
    }

    public void setExtraLanguageRate(int extraLanguageRate) {
        this.extraLanguageRate = extraLanguageRate;
    }

    public Marketing(String name, int baseSalary, int overtimeHour, int overtimeRate) {
        super(name, baseSalary, overtimeHour, overtimeRate);
    }

    public Marketing(String name, int baseSalary, int overtimeHour, int overtimeRate, int extraLanguage, int extraLanguageRate) {
        super(name, baseSalary, overtimeHour, overtimeRate);
        this.extraLanguage = extraLanguage;
        this.extraLanguageRate = extraLanguageRate;
    }

    @Override
    public int getPayment() {
        int staffSalary = super.getPayment();
        int payment = staffSalary + (this.extraLanguage * this.extraLanguageRate);
        System.out.println("Marketing payment " + staffSalary + " plus " + (this.extraLanguage * this.extraLanguageRate));
        return payment;
    }
}
