package com.system.account;

import com.system.dao.UserDao;
import com.system.entity.User;
import com.system.helper.BufferReaderProvider;

import java.io.BufferedReader;
import java.io.IOException;

public class Transfer {

    public static void transferMoney(int currentAccount,int receiverAccount) throws IOException {
        UserDao userDao = new UserDao();
        if (userDao.verifyAccountByAccountNumber(receiverAccount)){
            BufferedReader br = BufferReaderProvider.getBufferReader();
            User currentAccountDetail = userDao.getAccountByAccountNumber(currentAccount);
            User receiverAccountDetail = userDao.getAccountByAccountNumber(receiverAccount);
            System.out.println("Receiver Account Number: "+receiverAccountDetail.getAccountNumber());
            System.out.println("Receiver Account Holder Name: "+receiverAccountDetail.getName());
            System.out.println();
            System.out.println("Enter Money to transfer: ");
            double transfer=Double.parseDouble(br.readLine());
            Double currentAccountBalance = AccountBalance.hashMap.get(currentAccount);
            Double receiverAccountBalance = AccountBalance.hashMap.get(receiverAccount);
            if (transfer<=currentAccountBalance){
                double newCurrentAccountBalance = currentAccountBalance-transfer;
                double newReceiverAccountBalance = receiverAccountBalance+transfer;
                AccountBalance.hashMap.replace(currentAccount,newCurrentAccountBalance);
                AccountBalance.hashMap.replace(receiverAccount,newReceiverAccountBalance);
                System.out.println("Rs."+transfer+" transfer successfully to account "+receiverAccount);
            }else {
                System.out.println("Insufficient Fund..");
            }
        }else {
            System.out.println("Invalid Account Number!...");
        }
    }

}
