package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    System.out.println("================Конвертер валют 1.0.0 by Kirill Ekaterinin================");
    System.out.println("-----------------Может конвертировать Рубли в Доллары(США)----------------");
    System.out.println("---------------------Может конвертировать Рубли в Евро--------------------");
    System.out.println("-----------------Может конвертировать Доллары(США) в Рубли----------------");
    System.out.println("---------------------Может конвертировать Евро в Рубли--------------------");
    System.out.println("-------------------Может конвертировать Биткоины в Рубли------------------");
    System.out.println("---------------Может конвертировать Фунты стерлинги в Рубли---------------");
    System.out.println("-------------------Может конвертировать Рубли в Биткоины------------------");
    System.out.println("---------------Может конвертировать Рубли в Фунты стерлинги---------------");
    menu();
    }
    public static void menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Выберите:-----------------------------------------------------------------");
        System.out.println("1.Рубли в доллары---------------------------------------------------------");
        System.out.println("2.Доллары в рубли---------------------------------------------------------");
        System.out.println("3.Рубли в евро------------------------------------------------------------");
        System.out.println("4.Евро в Рубли------------------------------------------------------------");
        System.out.println("5.Биткоины в Рубли--------------------------------------------------------");
        System.out.println("6.Рубли в Биткоины--------------------------------------------------------");
        System.out.println("7.Фунты стерлинги в Рубли-------------------------------------------------");
        System.out.println("8.Рубли в Фунты стерлинги-------------------------------------------------");
        int answer = 0;
        try {
            answer = in.nextInt();
        } catch (InputMismatchException IME){
            System.out.println("---------------------------Введите число!---------------------------------");
            menu();
        }
        try {
            switch (answer) {
                case (1):
                    System.out.println("----------------------Вы выбрали Рубли в Доллары--------------------------");
                    System.out.println("---------Введите кол-во рублей которые вы хотите сконвертировать----------");
                    double rubInUsd = in.nextDouble();
                    RUB_in_USD h = new RUB_in_USD(rubInUsd);
                    System.out.println("Вы сконвертировали " + RUB_in_USD.x + " рублей в " + RUB_in_USD.konverting() + " долларов");
                    break;
                case (2):
                    System.out.println("----------------------Вы выбрали Доллары в Рубли--------------------------");
                    System.out.println("---------Введите кол-во Долларов которые вы хотите сконвертировать--------");
                    double usdInRub = in.nextDouble();
                    RUB_in_USD j = new RUB_in_USD(usdInRub);
                    System.out.println("Вы сконвертировали " + USD_in_RUB.x + " долларов в " + USD_in_RUB.konverting() + " рублей");
                    break;
                case (3):
                    System.out.println("----------------------Вы выбрали Рубли в евро-----------------------------");
                    System.out.println("---------Введите кол-во Рублей которые вы хотите сконвертировать----------");
                    double rubInEuro = in.nextDouble();
                    RUB_in_EUR t = new RUB_in_EUR(rubInEuro);
                    System.out.println("Вы сконвертировали " + USD_in_RUB.x + " рублей в " + RUB_in_EUR.konverting() + " евро");
                    break;
                case (4):
                    System.out.println("----------------------Вы выбрали Евро в Рубли-----------------------------");
                    System.out.println("----------Введите кол-во Евро которые вы хотите сконвертировать-----------");
                    double eurInRub = in.nextDouble();
                    EUR_in_RUB eur_in_rub = new EUR_in_RUB(eurInRub);
                    System.out.println("Вы сконвертировали " + EUR_in_RUB.x + " Евро в " + EUR_in_RUB.konverting() + " Рублей");
                    break;
                case (5):
                    System.out.println("--------------------Вы выбрали Биткоины в Рубли---------------------------");
                    System.out.println("-------Введите кол-во Биткоинов которые вы хотите сконвертировать---------");
                    double btcInRub = in.nextDouble();
                    BTC_in_RUB btc_in_rub = new BTC_in_RUB(btcInRub);
                    System.out.println("Вы сконвертировали " + BTC_in_RUB.x + " Биткоинов в " + BTC_in_RUB.konverting() + " Рублей");
                    break;
                case (6):
                    System.out.println("--------------------Вы выбрали Рубли в Биткоины---------------------------");
                    System.out.println("---------Введите кол-во Рублей которые вы хотите сконвертировать----------");
                    double rubInBtc = in.nextDouble();
                    RUB_in_BTC rub_in_btc = new RUB_in_BTC(rubInBtc);
                    System.out.println("Вы сконвертировали " + RUB_in_BTC.x + " Рублей в " + RUB_in_BTC.konverting() + " Биткоинов");
                    break;
                case (7):
                    System.out.println("------------------Вы выбрали Фунты стерлинги в Рубли----------------------");
                    System.out.println("----Введите кол-во Фунтов стерлингов которые вы хотите сконвертировать----");
                    double gbpInRub = in.nextDouble();
                    GBP_in_RUB gbp_in_rub = new GBP_in_RUB(gbpInRub);
                    System.out.println("Вы сконвертировали " + GBP_in_RUB.x + " Фунтов в " + GBP_in_RUB.konverting() + " Рублей");
                    break;
                case (8):
                    System.out.println("------------------Вы выбрали Рубли в Фунты стерлинги----------------------");
                    System.out.println("---------Введите кол-во Рублей которые вы хотите сконвертировать----------");
                    double rubInGbp = in.nextDouble();
                    RUB_in_GBP rub_in_gbp = new RUB_in_GBP(rubInGbp);
                    System.out.println("Вы сконвертировали " + RUB_in_GBP.x + " Рублей в " + RUB_in_GBP.konverting() + " Фунтов стерлингов");
                    break;
                default:
                    System.out.println("---------------------Данной валюты нет в программе------------------------");
                    menu();
            }
        } catch (InputMismatchException e){
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("---------------------------Введите число!---------------------------------");
            menu();
        }
    }
}
