package ru.ke46138.calcplus;

// Рубли в евро
public class RUB_in_EUR extends X_in_Y {

    RUB_in_EUR(double x1) {
        x = x1;
    }

    // Этот метод конвертирует рубли в доллары
    public double convert() {
        return x / rateEURO;
    }
}

