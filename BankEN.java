package com.example.atm;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BankEN {
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
        System.out.println("Select operation: " + "\n" +
                "1. Account balance." + "\n" +
                "2. Cash/withdraw." + "\n" +
                "3. Deposit money." + "\n" +
                "4. Transaction report." + "\n" +
                "5. Money transfer." + "\n" +
                "6. Edit profile." + "\n" +
                "7. Exit.");
    }

    void accountBalance(){
        System.out.println("Type of currency: " + "\n" +
                "1. BYN" + "\n" +
                "2. USD" + "\n" +
                "3. EUR");
        int typeCurrency = (new Scanner(System.in).nextInt());
        if (typeCurrency == 1) {
            operations.add(date + " Check balance: " + balance + " BYN.");
            System.out.println("Your balance is " + balance + " BYN.");
        } else if (typeCurrency == 2) {
            operations.add(date + " Check balance: " + dol + " USD.");
            DecimalFormat format = new DecimalFormat("#.00");
            System.out.print("Your balance is ");
            System.out.print(format.format(dol));
            System.out.println(" USD.");
        } else if (typeCurrency == 3){
            operations.add(date + " Check balance: " + eur + " EUR.");
            DecimalFormat format = new DecimalFormat("#.00");
            System.out.print("Your balance is ");
            System.out.print(format.format(eur));
            System.out.println(" EUR.");
        }
    }

    void cashWithdraw (){
        System.out.println("Type of currency: " + "\n" +
                "1. BYN" + "\n" +
                "2. USD" + "\n" +
                "3. EUR");
        int typeCurrency = (new Scanner(System.in).nextInt());
        if (typeCurrency == 1){
            System.out.println("Enter the amount you want to withdraw: ");
            double amount = (new Scanner(System.in).nextDouble());
            operations.add(date + " Withdraw cash: " + amount + " BYN.");
            if (amount <= 0 || amount % 1 != 0){
                System.out.println("Incorrect amount.");
            } else if (amount >= 1500) {
                System.out.println("Limit is exceeded.");
            } else {
                if (balance < amount){
                    System.out.println("Insufficient funds.");
                }else {
                    balance -= amount;
                    System.out.println("Take your money.");
                }
            }
        } else if (typeCurrency == 2) {
            System.out.println("Enter the amount you want to withdraw: ");
            double amount = (new Scanner(System.in).nextDouble());
            operations.add(date + " Withdraw cash: " + amount + " USD.");
            if (amount <= 0 || amount % 1 != 0){
                System.out.println("Incorrect amount.");
            } else if (amount >= 535) {
                System.out.println("Limit is exceeded.");
            } else {
                if (dol < amount){
                    System.out.println("Insufficient funds.");
                }else {
                    dol -= amount;
                    System.out.println("Take your money.");
                }
            }
        } else if (typeCurrency == 3) {
            System.out.println("Enter the amount you want to withdraw: ");
            double amount = (new Scanner(System.in).nextDouble());
            operations.add(date + " Withdraw cash: " + amount + " EUR.");
            if (amount <= 0 || amount % 1 != 0){
                System.out.println("Incorrect amount.");
            } else if (amount >= 500) {
                System.out.println("Limit is exceeded.");
            } else {
                if (eur < amount){
                    System.out.println("Insufficient funds.");
                }else {
                    eur -= amount;
                    System.out.println("Take your money.");
                }
            }
        }
    }

    void depositMoney (){
        System.out.println("Type of currency: " + "\n" +
                "1. BYN" + "\n" +
                "2. USD" + "\n" +
                "3. EUR");
        int currency = (new Scanner(System.in).nextInt());
        if (currency == 1) {
            System.out.println("Enter the amount you want to deposit.");
            double amountDeposit = (new Scanner(System.in).nextDouble());
            operations.add(date + " Deposit cash: " + amountDeposit + " BYN.");
            if (amountDeposit <= 0 || amountDeposit % 1 !=0){
                System.out.println("Incorrect amount.");
            } else if (amountDeposit >= 1500) {
                System.out.println("Limit is exceeded.");
            } else {
                balance += amountDeposit;
                System.out.println("Money deposited into account.");
            }
        } else if (currency == 2) {
            System.out.println("Enter the amount you want to deposit.");
            double amountDeposit = (new Scanner(System.in).nextDouble());
            operations.add(date + " Deposit cash: " + amountDeposit + " USD.");
            if (amountDeposit <= 0 || amountDeposit % 1 !=0){
                System.out.println("Incorrect amount.");
            } else if (amountDeposit >= 535) {
                System.out.println("Limit is exceeded.");
            } else {
                dol += amountDeposit;
                System.out.println("Money deposited into account.");
            }
        } else if (currency == 3) {
            System.out.println("Enter the amount you want to deposit.");
            double amountDeposit = (new Scanner(System.in).nextDouble());
            operations.add(date + " Deposit cash: " + amountDeposit + " EUR.");
            if (amountDeposit <= 0 || amountDeposit % 1 !=0){
                System.out.println("Incorrect amount.");
            } else if (amountDeposit >= 500) {
                System.out.println("Limit is exceeded.");
            } else {
                balance += amountDeposit;
                System.out.println("Money deposited into account.");
            }
        }
    }

    void transactionReport () {
        System.out.println("Transaction list: ");
        for (Object opr : operations) {
            System.out.println(opr);
        }
    }

    void moneyTransfer (){
        System.out.println("Type of currency: " + "\n" +
                "1. BYN" + "\n" +
                "2. USD" + "\n" +
                "3. EUR");
        int currency = (new Scanner(System.in).nextInt());
        if (currency == 1){
            System.out.println("Enter cardholder account where to transfer money.");
            String cardNumber = (new Scanner(System.in).nextLine());
            System.out.println("Enter amount would you like to transfer.");
            int amountTransfer = (new Scanner(System.in).nextInt());
            operations.add(date + " Money transfer: " + amountTransfer + " BYN.");
            if (amountTransfer <= 0){
                System.out.println("Incorrect amount.");
            } else if (amountTransfer < 3){
                System.out.println("Transfer amount cannot be less than 3 BYN.");
            } else if (amountTransfer > balance) {
                System.out.println("Insufficient funds.");
            } else {
                balance -= amountTransfer;
                System.out.println("Executed successfully.");
            }
        } else if (currency == 2) {
            System.out.println("Enter cardholder account where to transfer money.");
            String cardNumber = (new Scanner(System.in).nextLine());
            System.out.println("Enter amount would you like to transfer.");
            int amountTransfer = (new Scanner(System.in).nextInt());
            operations.add(date + " Money transfer: " + amountTransfer + " USD.");
            if (amountTransfer <= 0){
                System.out.println("Incorrect amount.");
            } else if (amountTransfer < 1){
                System.out.println("Transfer amount cannot be less than 1 USD.");
            } else if (amountTransfer > dol) {
                System.out.println("Insufficient funds.");
            } else {
                dol -= amountTransfer;
                System.out.println("Executed successfully.");
            }
        } else if (currency == 3) {
            System.out.println("Enter cardholder account where to transfer money.");
            String cardNumber = (new Scanner(System.in).nextLine());
            System.out.println("Enter amount would you like to transfer.");
            int amountTransfer = (new Scanner(System.in).nextInt());
            operations.add(date + " Money transfer: " + amountTransfer + " EUR.");
            if (amountTransfer <= 0){
                System.out.println("Incorrect amount.");
            } else if (amountTransfer < 1){
                System.out.println("Transfer amount cannot be less than 1 EUR.");
            } else if (amountTransfer > eur) {
                System.out.println("Insufficient funds.");
            } else {
                eur -= amountTransfer;
                System.out.println("Executed successfully.");
            }
        }
    }

    void exit (){
        System.out.println("Thank you for the work!");
//        next = false;
    }

}
