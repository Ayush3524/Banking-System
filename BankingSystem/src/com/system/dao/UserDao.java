package com.system.dao;

import com.system.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public static List<User> users=new ArrayList<>();

    //save user object to list
    public void saveUser(User user){
        this.users.add(user);
    }

    //get user by account number
    public User getAccountByAccountNumber(int accountNumber){
        User user = new User();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getAccountNumber()==accountNumber){
                user= users.get(i);
            }
        }
        return user;
    }

    //verify if account is exits or not
    public boolean verifyAccountByAccountNumber(int accountNumber){
        boolean f=false;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getAccountNumber()==accountNumber){
                f=true;
            }
        }
        return f;
    }
}
