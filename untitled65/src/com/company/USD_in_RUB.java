package com.company;
//доллары в рубли
public class USD_in_RUB extends X_in_Y{
    USD_in_RUB(double x){
        X_in_Y.x = x;
    }
    public static double konverting(){    //этот метод конвертирует доллары в рубли
        y = x * rateUSD;
        return y;
    }
}
