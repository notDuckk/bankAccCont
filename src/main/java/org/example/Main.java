package org.example;

import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        bankAccounts.add(new BankAccount(100,"John",1));
        bankAccounts.add(new BankAccount(400,"Hector",2));
        bankAccounts.add(new BankAccount(1000,"Matt",3));

        BankAccount acc;
        bankAccounts.add(acc = new BankAccount());
//        acc1.bankTransfer(acc,50);
        mainMenu(acc);



    }
    public static void mainMenu(BankAccount bankAcc) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello " + bankAcc.getName());
        System.out.println("Welcome to the Main Menu, what would you like to do today?");
        System.out.println("1. To check account balance\n2. To make a withdraw\n3. To make a deposit\n4. To make a transfer to another acc\n5. To exit");
        int option = input.nextInt();

        switch (option) {
            case 1:
                System.out.println(bankAcc.getBalance());
                break;
            case 2:
                System.out.println("How much would you like to withdraw?");
                int withdraw = input.nextInt();
                bankAcc.withdraw(withdraw);
                break;
            case 3:
                System.out.println("How much would you like to deposit?");
                int deposit = input.nextInt();
                bankAcc.deposit(deposit);
                break;
            case 4:
                while (true) {
                    System.out.println("Please enter the account number to transfer to?");
                    int acc2 = input.nextInt();
                    BankAccount trans2 = null;

                    for (BankAccount acc : bankAccounts) {
                        if (acc.getAccountNumber() == acc2) {
                            trans2 = acc;
                            break;
                        }
                    }
                    if (trans2 == null) {
                        System.out.println("Account not found");
                        continue;
                    }
                    int trans = input.nextInt();
                    bankAcc.bankTransfer(trans2, trans);
                    System.out.println("Transfer successful");
                    System.out.println("The name on the account is: " + bankAcc.getName() + " and they have a balance of " + bankAcc.getBalance());
                    System.out.println("The name on the account is: " + trans2.getName() + " and they have a balance of " + trans2.getBalance());
                    break;
                }
            case 5:
                break;
        }

    }


}