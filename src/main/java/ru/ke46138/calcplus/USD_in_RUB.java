package ru.ke46138.calcplus;

// Доллары в рубли
public class USD_in_RUB extends X_in_Y {

    USD_in_RUB(double x1) {
        x = x1;
    }

    // Этот метод конвертирует доллары в рубли
    public double convert() {
        return x * rateUSD;
    }
}
