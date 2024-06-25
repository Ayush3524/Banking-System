package com.system.account;

import com.system.helper.BufferReaderProvider;

import java.io.BufferedReader;
import java.io.IOException;

public class Deposit {

    public static void depositMoney(int accountNumber) throws IOException {
        BufferedReader br = BufferReaderProvider.getBufferReader();
        Double balance = AccountBalance.hashMap.get(accountNumber);
        try {
            System.out.println("Enter Money To Deposit: ");
            double deposit=Double.parseDouble(br.readLine());
            if (deposit<=50000){
                double newBalance=balance+deposit;
                AccountBalance.hashMap.replace(accountNumber,newBalance);
                System.out.println("Money Deposited Successfully");
            }else {
                System.out.println("Maximum Deposit Can be Rs.50000");
            }
        }catch (NumberFormatException e){
            System.out.println("Enter Integer Only...");
        }
    }
}
