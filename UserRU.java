package com.example.atm;

import java.util.Scanner;

public class UserRU {
    private String userName;
    private String password;
    boolean flag = true;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void registr(){
        System.out.println();
        System.out.println("РЕГИСТРАЦИЯ");
        System.out.println("Создайте имя пользователя:");
        setUserName((new Scanner(System.in).nextLine()));
        System.out.println("Создайте пароль:");
        setPassword((new Scanner(System.in).nextLine()));
        System.out.println("Вы зарегистрированы как " + userName + ". Ваш пароль " + password);
        System.out.println();
    }
    void enter(){
        System.out.println();
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("ВХОД");
            System.out.println("Введите имя пользователя: ");
            String inputUserName = (new Scanner(System.in).nextLine());
            System.out.println("Введите пароль: ");
            String inputPassword = (new Scanner(System.in).nextLine());
            if (inputPassword.equals(getPassword()) && inputUserName.equals(getUserName())) {
                System.out.println("ВХОД ВЫПОЛНЕН");
                flag = true;
                break;
            } else if (i <= 2){
                System.out.println("ПАРОЛЬ ИЛИ ИМЯ ПОЛЬЗОВАТЕЛЯ НЕВЕРНЫ");
            }else {
                System.out.println("КАРТА ЗАБЛОКИРОВАНА");
            }
            flag = false;
        }
        System.out.println();
    }

    void newUser (){
        System.out.println("1. Изменить имя пользователя." + "\n" +
                "2. Изменить пароль.");
        int input = (new Scanner(System.in).nextInt());
        if (input == 1){
            System.out.println("Введите новое имя пользователя: ");
            setUserName(new Scanner(System.in).nextLine());
            System.out.println("Имя пользователя успешно изменено.");
        } else if (input == 2) {
            System.out.println("Введите новый пароль: ");
            setPassword(new Scanner(System.in).nextLine());
            System.out.println("Пароль успешно изменен.");
        }
    }
}
