package com.company;

public class BTC_in_RUB extends X_in_Y{
    BTC_in_RUB(double x){
        X_in_Y.x = x;
    }
    public static double konverting(){    //этот метод конвертирует доллары в рубли
        y = x * rateBTC;
        return y;
    }
}
