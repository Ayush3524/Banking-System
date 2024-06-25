package com.system.services;

import com.system.account.AccountBalance;
import com.system.dao.UserDao;
import com.system.entity.User;
import com.system.helper.BufferReaderProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Random;

public class CreateAccount {

    //create user
    public static void createAccount() throws IOException {
        try {
            UserDao userDao=new UserDao();
            BufferedReader br = BufferReaderProvider.getBufferReader();
            Random random = new Random();
            System.out.println("Enter Account Holder Name: ");
            String name=br.readLine();
            System.out.println("Enter Account Holder age: ");
            int age=Integer.parseInt(br.readLine());
            System.out.println("Enter Account Mobile No: ");
            long mobileNo=Long.parseLong(br.readLine());
            System.out.println("Enter Account Holder Address: ");
            String address=br.readLine();
            System.out.println("Enter Account Holder password: ");
            String password=br.readLine();
            int accountNumber=random.nextInt(1023510000,1023519999);
            User user = new User(accountNumber, name, age, mobileNo, address, password.trim());
            userDao.saveUser(user);
            AccountBalance.setBalanceByAccountNumber(accountNumber,0);
            System.out.println("Account Created Successfully....");
            System.out.println();
            System.out.println("your Account Number is: "+user.getAccountNumber());
            System.out.println("Remember it. May be useful for login");
        }catch (NumberFormatException e){
            System.out.println("Enter Age and Mobile No in Integer Only....");
        }
    }

}
