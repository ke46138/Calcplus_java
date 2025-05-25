package ru.ke46138.calcplus;

public class BTC_in_RUB extends X_in_Y{

    BTC_in_RUB(double x1){
        x = x1;
    }

    // Этот метод конвертирует доллары в рубли
    public double convert(){
        return x * rateBTC;
    }
}
