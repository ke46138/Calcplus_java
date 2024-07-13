package com.company;
//евро в рубли
public class EUR_in_RUB extends X_in_Y{
    EUR_in_RUB(double x){
        X_in_Y.x = x;
    }
    public static double konverting(){    //этот метод конвертирует доллары в рубли
        y = x * rateEURO;
        return y;
    }
}
