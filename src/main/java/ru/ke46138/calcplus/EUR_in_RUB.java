package ru.ke46138.calcplus;
// Евро в рубли
public class EUR_in_RUB extends X_in_Y {

    EUR_in_RUB(double x1) {
        x = x1;
    }

    //этот метод конвертирует доллары в рубли
    public double convert() {
        return x * rateEURO;
    }
}
