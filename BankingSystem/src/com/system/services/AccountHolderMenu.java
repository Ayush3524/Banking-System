package com.system.services;

import com.system.account.*;
import com.system.helper.BufferReaderProvider;

import java.io.BufferedReader;
import java.io.IOException;

public class AccountHolderMenu {

    public static void accountHolderMenu() throws IOException {
        BufferedReader br = BufferReaderProvider.getBufferReader();
        Integer currentHolderAccountNumber = LoginAccount.hashMap.get("loginAccountNumber");
        while (true){
            System.out.println();
            System.out.println("**************| Account "+currentHolderAccountNumber+" |********************");
            System.out.println("1. Account Details");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Return");
            System.out.print("Choose an option: ");
            int ch=Integer.parseInt(br.readLine());
            switch (ch){
                case 1:
                    AccountDetails.getAccountDetails(currentHolderAccountNumber);
                    break;
                case 2:
                    Deposit.depositMoney(currentHolderAccountNumber);
                    break;
                case 3:
                    Withdraw.withdrawMoney(currentHolderAccountNumber);
                    break;
                case 4:
                    try {
                        System.out.println("Enter Receiver Account Number: ");
                        int receiverAccountNumber=Integer.parseInt(br.readLine());
                        Transfer.transferMoney(currentHolderAccountNumber,receiverAccountNumber);
                    }catch (NumberFormatException e){
                        System.out.println("Enter Integer Only....");
                    }
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Balance is: Rs."+AccountBalance.hashMap.get(currentHolderAccountNumber));
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid Choice!Try again...");
            }
        }
    }
}
