package com.example.atm;


import java.util.Scanner;

public class UserEN {

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
        System.out.println("REGISTRATION");
        System.out.println("Create username:");
        setUserName((new Scanner(System.in).nextLine()));
        System.out.println("Create password:");
        setPassword((new Scanner(System.in).nextLine()));
        System.out.println("You are registered as " + userName + ". Your password is " + password);
        System.out.println();
    }
    void enter(){
        System.out.println();
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("LOGIN");
            System.out.println("Enter username: ");
            String inputUserName = (new Scanner(System.in).nextLine());
            System.out.println("Enter password: ");
            String inputPassword = (new Scanner(System.in).nextLine());
            if (inputPassword.equals(getPassword()) && inputUserName.equals(getUserName())) {
                System.out.println("LOGIN COMPLETED");
                flag = true;
                break;
            } else if (i <= 2){
                System.out.println("PASSWORD OR USERNAME IS WRONG");
            }else {
                System.out.println("CARD ARE BLOCKED");
            }
            flag = false;
        }
        System.out.println();
    }

    void newUser (){
        System.out.println("1. Change username." + "\n" +
                "2. Change password.");
        int input = (new Scanner(System.in).nextInt());
        if (input == 1){
            System.out.println("Enter new username: ");
            setUserName(new Scanner(System.in).nextLine());
            System.out.println("Username successfully changed.");
        } else if (input == 2) {
            System.out.println("Enter new password: ");
            setPassword(new Scanner(System.in).nextLine());
            System.out.println("Password successfully changed.");
        }
    }
}
