package com.tamrin8.secondPart.bank;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Account account;
        Account tempAccount;
        Bank bank = new Bank();
        System.out.println("***********************");
        System.out.println("*   Welcome To Bank   *");
        System.out.println("***********************\n");

        boolean mainFlage = true;
        while (mainFlage)
        {
            System.out.println("   Choose Your Action");
            System.out.println("------------------------");
            System.out.println("1- Add Account");
            System.out.println("2- Deposit");
            System.out.println("3- Withdraw");
            System.out.println("4- Get Account");
            System.out.println("5- Goto Tomorrow");
            System.out.println("6- Exit");
            System.out.println("------------------------");

            byte choice = sc.nextByte();

            switch (choice)
            {
                case 1:
                        System.out.println(" Fill Out the Form Below");
                        System.out.println("-------------------------");
                        System.out.print("Enter Account Number: ");
                        int accNum = sc.nextInt();
                        System.out.print("Enter Account Name: ");
                        String accName = sc.next();
                        System.out.print("Enter Balance: ");
                        double balance = sc.nextDouble();
                        account = new Account(accNum, accName, balance);

                        if (bank.addAccount(account))
                        {
                            System.out.println("\n\t\t\t######################");
                            System.out.println("\t\t\t#   Account Added!   #");
                            System.out.println("\t\t\t######################\n");
                        }
                        else
                        {
                            System.out.println("\n\t\t\t##########################");
                            System.out.println("\t\t\t#  Can not Add Account!  #");
                            System.out.println("\t\t\t##########################\n");
                            break;
                        }

                    break;

                case 2:
                        System.out.println(" Fill Out the Form Below For Deposit");
                        System.out.println("-------------------------------------");
                        System.out.print("Enter Account Number: ");
                        int accNumForDeposit = sc.nextInt();
                        System.out.print("Enter Amount: ");
                        double depositAmount = sc.nextDouble();
                        System.out.print("Enter Your Description: ");
                        String clear = sc.nextLine();
                        String depositDescription = sc.nextLine();

                        if(bank.deposit(accNumForDeposit, depositAmount, depositDescription))
                        {
                            System.out.println("\n\t\t\t########################");
                            System.out.println("\t\t\t#  Deposit Successful  #");
                            System.out.println("\t\t\t########################\n");
                        }
                        else {
                            System.out.println("\n\t\t\t####################");
                            System.out.println("\t\t\t#  Deposit Failed  #");
                            System.out.println("\t\t\t####################\n");

                        }

                        break;
                case 3:
                        System.out.println(" Fill Out the Form Below For Deposit");
                        System.out.println("-------------------------------------");
                        System.out.print("Enter Account Number: ");
                        int accNumForWithdraw = sc.nextInt();
                        System.out.print("Enter Amount: ");
                        double withdrawAmount = sc.nextDouble();
                        System.out.print("Enter Your Description: ");
                        clear = sc.nextLine();
                        String withdrawDescription = sc.nextLine();

                        if (bank.withdraw(accNumForWithdraw, withdrawAmount, withdrawDescription))
                        {
                            System.out.println("\n\t\t\t#########################");
                            System.out.println("\t\t\t#  Withdraw Successful  #");
                            System.out.println("\t\t\t#########################\n");
                        }
                        else
                        {
                            System.out.println("\n\t\t\t#####################");
                            System.out.println("\t\t\t#  Withdraw Failed  #");
                            System.out.println("\t\t\t#####################\n");
                        }

                    break;

                case 4:
                        System.out.println(" View Account Information");
                        System.out.println("--------------------------");
                        System.out.print("Enter Account Number: ");
                        int accNumForGettingAccount = sc.nextInt();
                        tempAccount = bank.getAccount(accNumForGettingAccount);
                        if ( tempAccount != null)
                        {
                            System.out.println("Account Number: " + tempAccount.getAccountNumber() + " | Account Name: " + tempAccount.getAccountHolderName() + " | Balance: " + tempAccount.getBalance());
                            System.out.println();
                            System.out.println("                     Transactions                    ");
                            System.out.println("******************************************************");

                            if (tempAccount.getTransactions() != null)
                            {
                                for (int i = 0; tempAccount.getTransactions()[i] != null; i++)
                                {
                                    System.out.println((i+1) + "- " + '{' + " Date: " + tempAccount.getTransactions()[i].getDate() + " | Type: " + tempAccount.getTransactions()[i].getType()
                                            + " | Amount: " + tempAccount.getTransactions()[i].getAmount() + " | Description: " + tempAccount.getTransactions()[i].getDescription() + " }");
                                }
                                System.out.println("----------------------------------------------------------");
                                System.out.println();
                            }
                            else if (tempAccount.getTransactions() == null)
                            {
                                System.out.println("\n\t\t\t***** No Transaction *****\n");
                            }
                        }
                        else
                        {
                            System.out.println("\n\t\t\t***** Can Not Find Any Account With This Accont Number *****\n");
                            break;
                        }

                    break;

                case 5:
                    bank.incrementCurrentDate();
                    System.out.println("\n\t\t\t***** Transaction's Date Updated *****\n");
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }

    }
}
