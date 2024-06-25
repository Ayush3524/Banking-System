package com.system.account;

import com.system.helper.BufferReaderProvider;

import java.io.BufferedReader;
import java.io.IOException;

public class Withdraw {

    public static void withdrawMoney(int accountNumber) throws IOException {
        BufferedReader br = BufferReaderProvider.getBufferReader();
        Double balance = AccountBalance.hashMap.get(accountNumber);
        try {
            System.out.println("Enter Money to withdraw: ");
            double withdraw=Double.parseDouble(br.readLine());
            if (withdraw<=10000){
                double newBalance = balance-withdraw;
                AccountBalance.hashMap.replace(accountNumber,newBalance);
                System.out.println("Withdrawal Successfully....");
            }else {
                System.out.println("Maximum Withdrawal can be Rs.10000");
            }
        }catch (NumberFormatException e){
            System.out.println("Enter Integer Only....");
        }
    }
}
