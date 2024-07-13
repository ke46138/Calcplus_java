package com.company;

public class RUB_in_BTC extends X_in_Y{
    RUB_in_BTC(double x){
        X_in_Y.x = x;
    }
    public static double konverting(){    //этот метод конвертирует рубли в биткоины
        y = x / rateBTC;
        return y;
    }
}
