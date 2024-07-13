package com.company;
//рубли в доллары
public class RUB_in_USD extends X_in_Y{
    RUB_in_USD(double x){
        X_in_Y.x = x;
    }
    public static double konverting(){    //этот метод конвертирует рубли в доллары
        y = x / rateUSD;
        return y;
    }
}
