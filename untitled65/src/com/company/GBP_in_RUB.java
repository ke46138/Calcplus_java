package com.company;

public class GBP_in_RUB extends X_in_Y{
    GBP_in_RUB(double x){
        X_in_Y.x = x;
    }
    public static double konverting(){    //этот метод конвертирует фунты стерлинги в рубли
        y = x * rateGBP;
        return y;
    }
}
