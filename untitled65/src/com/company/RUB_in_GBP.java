package com.company;

public class RUB_in_GBP extends X_in_Y{
    RUB_in_GBP(double x){
        X_in_Y.x = x;
    }
    public static double konverting(){    //этот метод конвертирует рубли в фунты стерлингов
        y = x / rateGBP;
        return y;
    }
}
