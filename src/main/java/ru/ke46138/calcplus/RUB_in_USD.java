package ru.ke46138.calcplus;

// Рубли в доллары
public class RUB_in_USD extends X_in_Y {

    RUB_in_USD(double x1) {
        x = x1;
    }

    // Этот метод конвертирует рубли в доллары
    public double convert() {
        return x / rateUSD;
    }
}
