package com.system.services;

import com.system.dao.UserDao;
import com.system.entity.User;
import com.system.helper.BufferReaderProvider;

import java.io.BufferedReader;
import java.io.IOException;

public class QueryAccount {

    public static void getAccount() throws IOException {
        UserDao userDao = new UserDao();
        BufferedReader br = BufferReaderProvider.getBufferReader();
        try {
            System.out.println();
            System.out.println("Enter Account Number: ");
            int accountNumber=Integer.parseInt(br.readLine());
            User user = userDao.getAccountByAccountNumber(accountNumber);
            if (user.getAccountNumber()==0){
                System.out.println("No Deatils Found for this Account "+accountNumber);
            }else {
                System.out.println();
                System.out.println("Account Number: "+user.getAccountNumber());
                System.out.println("Account Holder name: "+user.getName());
            }
        }catch (NumberFormatException e){
            System.out.println("Enter Account Number in Integer Only..");
        }

    }
}
