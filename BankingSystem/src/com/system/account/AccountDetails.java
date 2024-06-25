package com.system.account;

import com.system.dao.UserDao;
import com.system.entity.User;

public class AccountDetails {

    public static void getAccountDetails(int accountNumber){
        UserDao userDao = new UserDao();
        User user = userDao.getAccountByAccountNumber(accountNumber);
        System.out.println();
        System.out.println("Account Number: "+user.getAccountNumber());
        System.out.println("Account Holder Name: "+user.getName());
        System.out.println("Age: "+user.getAge());
        System.out.println("Mobile: "+user.getMobileNo());
        System.out.println("Address: "+user.getAddress());
        System.out.println("Password: "+user.getPassword());
    }
}
