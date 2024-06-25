package com.system.services;


import com.system.dao.UserDao;
import com.system.entity.User;
import com.system.helper.BufferReaderProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

public class LoginAccount {

    public static HashMap<String,Integer> hashMap=new HashMap<>();

    public static boolean loginAccount() throws IOException {
        boolean f=false;
        UserDao userDao = new UserDao();
        BufferedReader br = BufferReaderProvider.getBufferReader();
        System.out.println();
        try {
            System.out.println("Enter Account Number: ");
            int accountNumber=Integer.parseInt(br.readLine());
            System.out.println("Enter Account Password: ");
            String password=br.readLine();
            User user = userDao.getAccountByAccountNumber(accountNumber);
            if (user==null){
                f=false;
            }
            if (user.getAccountNumber()==accountNumber && user.getPassword().equals(password.trim())){
                hashMap.put("loginAccountNumber",accountNumber);
                f=true;
            }
        }catch (NumberFormatException e){
            f=false;
        }
        return f;
    }
}
