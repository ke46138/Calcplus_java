package ru.ke46138.calcplus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====================Конвертер валют 2.0.0 by ke46138=====================");
        System.out.println("-----------------Может конвертировать Рубли в Доллары(США)----------------");
        System.out.println("---------------------Может конвертировать Рубли в Евро--------------------");
        System.out.println("-----------------Может конвертировать Доллары(США) в Рубли----------------");
        System.out.println("---------------------Может конвертировать Евро в Рубли--------------------");
        System.out.println("-------------------Может конвертировать Биткоины в Рубли------------------");
        System.out.println("---------------Может конвертировать Фунты стерлинги в Рубли---------------");
        System.out.println("-------------------Может конвертировать Рубли в Биткоины------------------");
        System.out.println("---------------Может конвертировать Рубли в Фунты стерлинги---------------");
        System.out.println("--------------------Может конвертировать Евро в Доллары-------------------");
        System.out.println("-----------------NEW: Обновление курса валют из интернета-----------------");
        System.out.println("----------------------Нажмите Enter для продолжения-----------------------");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        X_in_Y.updateRate();
        while (true) {
            System.out.println("--------------------------------------------------------------------------");
            System.out.println("---------------------------------Меню-------------------------------------");
            System.out.println("Выберите:-----------------------------------------------------------------");
            System.out.println("1. Рубли в доллары--------------------------------------------------------");
            System.out.println("2. Доллары в рубли--------------------------------------------------------");
            System.out.println("3. Рубли в евро-----------------------------------------------------------");
            System.out.println("4. Евро в Рубли-----------------------------------------------------------");
            System.out.println("5. Биткоины в Рубли-------------------------------------------------------");
            System.out.println("6. Рубли в Биткоины-------------------------------------------------------");
            System.out.println("7. Фунты стерлинги в Рубли------------------------------------------------");
            System.out.println("8. Рубли в Фунты стерлинги------------------------------------------------");
            System.out.println("9. Евро в Доллары---------------------------------------------------------");
            System.out.println("0. Выход------------------------------------------------------------------");

            try {
                int answer = scanner.nextInt();

                switch (answer) {
                    case (1):
                        System.out.println("----------------------Вы выбрали Рубли в Доллары--------------------------");
                        double course1 = 1 / X_in_Y.rateUSD;
                        System.out.println("Текущий курс: " + course1 + " долларов США за 1 рубль");
                        System.out.println("---------Введите кол-во рублей которые вы хотите сконвертировать----------");
                        double rubs = scanner.nextDouble();
                        RUB_in_USD rubInUsd = new RUB_in_USD(rubs);
                        System.out.println("Вы сконвертировали " + rubInUsd.x + " рублей в " + rubInUsd.convert() + " долларов");
                        System.out.println("----------------------Нажмите Enter для продолжения-----------------------");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case (2):
                        System.out.println("----------------------Вы выбрали Доллары в Рубли--------------------------");
                        System.out.println("Текущий курс: " + X_in_Y.rateUSD + " рублей за 1 доллар США");
                        System.out.println("---------Введите кол-во Долларов которые вы хотите сконвертировать--------");
                        double usd = scanner.nextDouble();
                        USD_in_RUB usdInRub = new USD_in_RUB(usd);
                        System.out.println("Вы сконвертировали " + usdInRub.x + " долларов в " + usdInRub.convert() + " рублей");
                        System.out.println("----------------------Нажмите Enter для продолжения-----------------------");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case (3):
                        System.out.println("----------------------Вы выбрали Рубли в Евро-----------------------------");
                        double course2 = 1 / X_in_Y.rateEURO;
                        System.out.println("Текущий курс: " + course2 + " евро за 1 рубль");
                        System.out.println("---------Введите кол-во Рублей которые вы хотите сконвертировать----------");
                        double rubs1 = scanner.nextDouble();
                        RUB_in_EUR rubInEur = new RUB_in_EUR(rubs1);
                        System.out.println("Вы сконвертировали " + rubInEur.x + " рублей в " + rubInEur.convert() + " Евро");
                        System.out.println("----------------------Нажмите Enter для продолжения-----------------------");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case (4):
                        System.out.println("----------------------Вы выбрали Евро в Рубли-----------------------------");
                        System.out.println("Текущий курс: " + X_in_Y.rateEURO + " рублей за 1 евро");
                        System.out.println("----------Введите кол-во Евро которые вы хотите сконвертировать-----------");
                        double eur = scanner.nextDouble();
                        EUR_in_RUB eurInRub = new EUR_in_RUB(eur);
                        System.out.println("Вы сконвертировали " + eurInRub.x + " Евро в " + eurInRub.convert() + " Рублей");
                        System.out.println("----------------------Нажмите Enter для продолжения-----------------------");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case (5):
                        System.out.println("--------------------Вы выбрали Биткоины в Рубли---------------------------");
                        System.out.println("Текущий курс: " + X_in_Y.rateBTC + " рублей за 1 биткоин");
                        System.out.println("-------Введите кол-во Биткоинов которые вы хотите сконвертировать---------");
                        double btc = scanner.nextDouble();
                        BTC_in_RUB btcInRub = new BTC_in_RUB(btc);
                        System.out.println("Вы сконвертировали " + btcInRub.x + " Биткоинов в " + btcInRub.convert() + " Рублей");
                        System.out.println("----------------------Нажмите Enter для продолжения-----------------------");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case (6):
                        System.out.println("--------------------Вы выбрали Рубли в Биткоины---------------------------");
                        double course3 = 1 / X_in_Y.rateBTC;
                        System.out.println("Текущий курс: " + course3 + " биткоинов за 1 рубль");
                        System.out.println("---------Введите кол-во Рублей которые вы хотите сконвертировать----------");
                        double rubs2 = scanner.nextDouble();
                        RUB_in_BTC rubInBtc = new RUB_in_BTC(rubs2);
                        System.out.println("Вы сконвертировали " + rubInBtc.x + " Рублей в " + rubInBtc.convert() + " Биткоинов");
                        System.out.println("----------------------Нажмите Enter для продолжения-----------------------");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case (7):
                        System.out.println("------------------Вы выбрали Фунты стерлинги в Рубли----------------------");
                        System.out.println("Текущий курс: " + X_in_Y.rateGBP + " рублей за 1 фунт стерлинга");
                        System.out.println("----Введите кол-во Фунтов стерлингов которые вы хотите сконвертировать----");
                        double gbp = scanner.nextDouble();
                        GBP_in_RUB gbpInRub = new GBP_in_RUB(gbp);
                        System.out.println("Вы сконвертировали " + gbpInRub.x + " Фунтов в " + gbpInRub.convert() + " Рублей");
                        System.out.println("----------------------Нажмите Enter для продолжения-----------------------");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case (8):
                        System.out.println("------------------Вы выбрали Рубли в Фунты стерлинги----------------------");
                        double course4 = 1 / X_in_Y.rateGBP;
                        System.out.println("Текущий курс: " + course4 + " фунтов стерлингов за 1 рубль");
                        System.out.println("---------Введите кол-во Рублей которые вы хотите сконвертировать----------");
                        double rubs3 = scanner.nextDouble();
                        RUB_in_GBP rubInGbp = new RUB_in_GBP(rubs3);
                        System.out.println("Вы сконвертировали " + rubInGbp.x + " Рублей в " + rubInGbp.convert() + " Фунтов стерлингов");
                        System.out.println("----------------------Нажмите Enter для продолжения-----------------------");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case (9):
                        System.out.println("-----------------------Вы выбрали Евро в Доллары--------------------------");
                        System.out.println("Текущий курс: " + X_in_Y.rateEURinUSD + " долларов за 1 евро");
                        double eur1 = scanner.nextDouble();
                        EUR_in_USD eurInUsd = new EUR_in_USD(eur1);
                        System.out.println("----------Введите кол-во Евро которые вы хотите сконвертировать-----------");
                        System.out.println("Вы сконвертировали " + eurInUsd.x + " Евро в " + eurInUsd.convert() + " долларов");
                        System.out.println("----------------------Нажмите Enter для продолжения-----------------------");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case (23): // Пасхалка на 30 летие Java
                        System.out.println("----------------23 мая 1995 года вышла первая версия Java-----------------");
                        System.out.println("----------------------Нажмите Enter для продолжения-----------------------");
                        scanner.nextLine();
                        scanner.nextLine();
                        break;
                    case (0):
                        System.out.println("---------------------------Выход из программы-----------------------------");
                        System.exit(0);
                    default:
                        System.out.println("---------------------Данной валюты нет в программе------------------------");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("--------------------------------------------------------------------------");
                System.out.println("---------------------------Введите число!---------------------------------");
                scanner.nextLine();
            }
        }
    }
}