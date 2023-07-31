package com.example.atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    UserEN userEN = new UserEN();
    UserRU userRU = new UserRU();
    BankEN bankEN = new BankEN();
    BankRU bankRU = new BankRU();

    boolean next = true;
    System.out.println("Выберите язык, на котором хотите продолжить. / Select language would you like to continue." + "\n" +
            "1. English" + "\n" +
            "2. Русский");
    int select = (new Scanner(System.in).nextInt());
    if (select == 1) {
        userEN.registr();
        userEN.enter();
        if (userEN.flag == false){
            next = false;
        }else if (userEN.flag == true) {
            while (next == true) {
                bankEN.menu();
                int selectMenu = (new Scanner(System.in).nextInt());
                if (selectMenu == 1) {
                    bankEN.accountBalance();
                } else if (selectMenu == 2) {
                    bankEN.cashWithdraw();
                } else if (selectMenu == 3) {
                    bankEN.depositMoney();
                } else if (selectMenu == 4) {
                    bankEN.transactionReport();
                } else if (selectMenu == 5) {
                    bankEN.moneyTransfer();
                } else if (selectMenu == 6) {
                    userEN.newUser();
                } else if (selectMenu == 7) {
                    bankEN.exit();
                    next = false;
                }
            }
        }
    } else if (select == 2) {
        userRU.registr();
        userRU.enter();
        if (userRU.flag == false){
            next = false;
        } else if (userRU.flag = true) {
            while (next == true){
                 bankRU.menu();
                 int selectRUMenu = (new Scanner(System.in).nextInt());
                if (selectRUMenu == 1){
                    bankRU.accountBalance();
                } else if (selectRUMenu == 2) {
                    bankRU.cashWithdraw();
                } else if (selectRUMenu == 3) {
                    bankRU.depositMoney();
                 } else if (selectRUMenu == 4) {
                    bankRU.transactionReport();
                 } else if (selectRUMenu == 5) {
                    bankRU.moneyTransfer();
                } else if (selectRUMenu == 6) {
                    userRU.newUser();
                } else if (selectRUMenu == 7) {
                    bankRU.exit();
                    next = false;
            }
        }
    }
    }
    }
}
