package ru.ke46138.calcplus;

public class GBP_in_RUB extends X_in_Y {

    GBP_in_RUB(double x1) {
        x = x1;
    }

    // Этот метод конвертирует фунты стерлинги в рубли
    public double convert() {
        return x * rateGBP;
    }
}
