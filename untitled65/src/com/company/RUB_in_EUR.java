package com.company;
//рубли в евро
public class RUB_in_EUR extends X_in_Y{
        RUB_in_EUR(double x){
            X_in_Y.x = x;
        }
        public static double konverting(){    //этот метод конвертирует рубли в доллары
            y = x / rateEURO;
            return y;
        }
}

