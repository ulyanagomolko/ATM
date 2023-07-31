package com.example.atm;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BankRU {
    private boolean flag = true;
    private double balance = 1000;
    private double dollar = 2.8;
    private double dol = balance / dollar;
    private double euro = 3.0;
    private double eur = balance / euro;
    private List<Object> operations = new ArrayList<>();
    private Date date = new Date();
    void menu() {
        System.out.println();
        System.out.println("Выберите операцию: " + "\n" +
                "1. Просмотреть баланс." + "\n" +
                "2. Выдача наличных." + "\n" +
                "3. Внести деньги." + "\n" +
                "4. Отчёт по операциям." + "\n" +
                "5. Перевод стредств." + "\n" +
                "6. Редактировать профиль." + "\n" +
                "7. Выход.");
    }

    void accountBalance(){
        System.out.println("Выберити валюту: " + "\n" +
                "1. BYN" + "\n" +
                "2. USD" + "\n" +
                "3. EUR");
        int typeCurrency = (new Scanner(System.in).nextInt());
        if (typeCurrency == 1) {
            operations.add(date + " Просмотр баланса: " + balance + " BYN.");
            System.out.println("Ваш баланс составляет " + balance + " BYN.");
        } else if (typeCurrency == 2) {
            operations.add(date + " Просмотр баланса: " + dol + " USD.");
            DecimalFormat format = new DecimalFormat("#.00");
            System.out.print("Ваш баланс составляет ");
            System.out.print(format.format(dol));
            System.out.println(" USD.");
        } else if (typeCurrency == 3){
            operations.add(date + " Просмотр баланса: " + eur + " EUR.");
            DecimalFormat format = new DecimalFormat("#.00");
            System.out.print("Ваш баланс составляет ");
            System.out.print(format.format(eur));
            System.out.println(" EUR.");
        }
    }

    void cashWithdraw (){
        System.out.println("Выберите валюту: " + "\n" +
                "1. BYN" + "\n" +
                "2. USD" + "\n" +
                "3. EUR");
        int typeCurrency = (new Scanner(System.in).nextInt());
        if (typeCurrency == 1){
            System.out.println("Введите сумму, которую хотите снять: ");
            double amount = (new Scanner(System.in).nextDouble());
            operations.add(date + " Снятие наличных: " + amount + " BYN.");
            if (amount <= 0 || amount % 1 != 0){
                System.out.println("Неверная сумма.");
            } else if (amount >= 1500) {
                System.out.println("Лимит снятия наличных превышен.");
            } else {
                if (balance < amount){
                    System.out.println("Недостаточно средств.");
                }else {
                    balance -= amount;
                    System.out.println("Возьмите деньги.");
                }
            }
        } else if (typeCurrency == 2) {
            System.out.println("Введите сумму, которую хотите снять: ");
            double amount = (new Scanner(System.in).nextDouble());
            operations.add(date + " Снятие наличных: " + amount + " USD.");
            if (amount <= 0 || amount % 1 != 0){
                System.out.println("Неверная сумма.");
            } else if (amount >= 535) {
                System.out.println("Лимит снятия наличных превышен.");
            } else {
                if (dol < amount){
                    System.out.println("Недостаточно средств.");
                }else {
                    dol -= amount;
                    System.out.println("Возьмите деньги.");
                }
            }
        } else if (typeCurrency == 3) {
            System.out.println("Введите сумму, которую хотите снять: ");
            double amount = (new Scanner(System.in).nextDouble());
            operations.add(date + " Снятие наличных: " + amount + " EUR.");
            if (amount <= 0 || amount % 1 != 0){
                System.out.println("Неверная сумма.");
            } else if (amount >= 500) {
                System.out.println("Лимит снятия наличных превышен.");
            } else {
                if (eur < amount){
                    System.out.println("Недостаточно средств.");
                }else {
                    eur -= amount;
                    System.out.println("Возьмите деньги.");
                }
            }
        }
    }

    void depositMoney (){
        System.out.println("Выберите валюту: " + "\n" +
                "1. BYN" + "\n" +
                "2. USD" + "\n" +
                "3. EUR");
        int currency = (new Scanner(System.in).nextInt());
        if (currency == 1) {
            System.out.println("Введите сумму, которую хотите внести.");
            double amountDeposit = (new Scanner(System.in).nextDouble());
            operations.add(date + " Внесение наличных: " + amountDeposit + " BYN.");
            if (amountDeposit <= 0 || amountDeposit % 1 !=0){
                System.out.println("Неверная сумма.");
            } else if (amountDeposit >= 1500) {
                System.out.println("Лимит внесения наличных превышен.");
            } else {
                balance += amountDeposit;
                System.out.println("Деньги внесены на счёт.");
            }
        } else if (currency == 2) {
            System.out.println("Введите сумму, которую хотите внести.");
            double amountDeposit = (new Scanner(System.in).nextDouble());
            operations.add(date + " Внесение наличных: " + amountDeposit + " USD.");
            if (amountDeposit <= 0 || amountDeposit % 1 !=0){
                System.out.println("Неверная сумма.");
            } else if (amountDeposit >= 535) {
                System.out.println("Лимит внесения наличных превышен.");
            } else {
                dol += amountDeposit;
                System.out.println("Деньги внесены на счёт.");
            }
        } else if (currency == 3) {
            System.out.println("Введите сумму, которую хотите внести.");
            double amountDeposit = (new Scanner(System.in).nextDouble());
            operations.add(date + " Внесение наличных: " + amountDeposit + " EUR.");
            if (amountDeposit <= 0 || amountDeposit % 1 !=0){
                System.out.println("Неверная сумма.");
            } else if (amountDeposit >= 500) {
                System.out.println("Лимит внесения наличных превышен.");
            } else {
                balance += amountDeposit;
                System.out.println("Деньги внесены на счет.");
            }
        }
    }

    void transactionReport () {
        System.out.println("Список транзакций: ");
        for (Object opr : operations) {
            System.out.println(opr);
        }
    }

    void moneyTransfer (){
        System.out.println("Выберите валюту: " + "\n" +
                "1. BYN" + "\n" +
                "2. USD" + "\n" +
                "3. EUR");
        int currency = (new Scanner(System.in).nextInt());
        if (currency == 1){
            System.out.println("Введите счёт получателя.");
            String cardNumber = (new Scanner(System.in).nextLine());
            System.out.println("Введите сумму, которую хотите перевести.");
            int amountTransfer = (new Scanner(System.in).nextInt());
            operations.add(date + " Перевод средств: " + amountTransfer + " BYN.");
            if (amountTransfer <= 0){
                System.out.println("Неверная сумма.");
            } else if (amountTransfer < 3){
                System.out.println("Сумма перевода не может быть меньше 3 BYN.");
            } else if (amountTransfer > balance) {
                System.out.println("Недостаточно средств.");
            } else {
                balance -= amountTransfer;
                System.out.println("Выполнено успешно.");
            }
        } else if (currency == 2) {
            System.out.println("Введите счёт получателя.");
            String cardNumber = (new Scanner(System.in).nextLine());
            System.out.println("Введите сумму перевода.");
            int amountTransfer = (new Scanner(System.in).nextInt());
            operations.add(date + " Перевод средств: " + amountTransfer + " USD.");
            if (amountTransfer <= 0){
                System.out.println("Неверная сумма.");
            } else if (amountTransfer < 1){
                System.out.println("Сумма перевода не может быть меньше 1 USD.");
            } else if (amountTransfer > dol) {
                System.out.println("Недостаточно средств.");
            } else {
                dol -= amountTransfer;
                System.out.println("Выполнено успешно.");
            }
        } else if (currency == 3) {
            System.out.println("Введите счёт получателя.");
            String cardNumber = (new Scanner(System.in).nextLine());
            System.out.println("Введите сумму перевода.");
            int amountTransfer = (new Scanner(System.in).nextInt());
            operations.add(date + " Перевод средств: " + amountTransfer + " EUR.");
            if (amountTransfer <= 0){
                System.out.println("Неверная сумма.");
            } else if (amountTransfer < 1){
                System.out.println("Сумма перевода не может быть меньше 1 EUR.");
            } else if (amountTransfer > eur) {
                System.out.println("Недостаточно средств.");
            } else {
                eur -= amountTransfer;
                System.out.println("Выполнено успешно.");
            }
        }
    }

    void exit (){
        System.out.println("Спасибо за работу!");
//        next = false;
    }

}
