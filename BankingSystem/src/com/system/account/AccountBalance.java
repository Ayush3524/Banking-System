package com.system.account;

import java.util.HashMap;

public class AccountBalance {

    public static HashMap<Integer, Double> hashMap=new HashMap<>();

    //get account balance by account number
    public static double getBalanceByAccountNumber(int accountNumber){
        return hashMap.get(accountNumber);
    }

    //set balance by account number
    public static void setBalanceByAccountNumber(int accountNumber,double balance){
        hashMap.put(accountNumber,balance);
    }
}
