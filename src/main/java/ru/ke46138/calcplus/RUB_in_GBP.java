package ru.ke46138.calcplus;

public class RUB_in_GBP extends X_in_Y {

    RUB_in_GBP(double x1) {
        x = x1;
    }

    // Этот метод конвертирует рубли в фунты стерлингов
    public double convert() {
        return x / rateGBP;
    }
}
