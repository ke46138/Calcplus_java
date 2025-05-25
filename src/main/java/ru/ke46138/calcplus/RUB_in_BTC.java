package ru.ke46138.calcplus;

public class RUB_in_BTC extends X_in_Y {

    RUB_in_BTC(double x1) {
        x = x1;
    }

    // Этот метод конвертирует рубли в биткоины
    public double convert() {
        return x / rateBTC;
    }
}
