package ru.ke46138.calcplus;

public class EUR_in_USD extends X_in_Y{

    EUR_in_USD(double x1) {
        x = x1;
    }

    public double convert() {
        return x * rateEURinUSD;
    }
}
