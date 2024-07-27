package org.example;

import java.util.Scanner;

public class BankAccount {
    Scanner input = new Scanner(System.in);
    double balance;
    String name;
    int accountNumber;




    public BankAccount(int balance, String name, int accountNumber) {
        this.balance = balance;
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public BankAccount() {

        while (true) {
            System.out.println("Are you an existing customer? (y/n)");
            String answer = input.nextLine();
            if (answer.equals("n")) {
                System.out.println("Let's make a new account!");
                System.out.println("What is the name for the account?");
                this.name = input.nextLine();
                System.out.println("What is the beginning balance for the account?");
                this.balance = input.nextDouble();
                this.accountNumber = (int) System.currentTimeMillis();
                break;
            } else if (answer.equals("y")) {
                System.out.println("Enter the name on the account.");
                this.name = input.nextLine();
                break;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }

    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void bankTransfer(BankAccount account, double amount) {
        this.balance -= amount;
        account.deposit(amount);
    }


    public String getName() {
        return name;
    }

    public void deposit(double depositAmnt) {
        this.balance += depositAmnt;
    }



    public void withdraw(double withdrawAmnt) {
        this.balance -= withdrawAmnt;
    }

    public double getBalance() {
        return this.balance;
    }

    public void accDetails() {
        System.out.println("Account holder: " + this.name  + "\n" + "Balance: " + this.balance + "\n" + "Account number: " + this.accountNumber);
    }
}