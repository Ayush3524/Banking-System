package com.system.services;



import com.system.helper.BufferReaderProvider;

import java.io.BufferedReader;
import java.io.IOException;


public class UserMenu {

    public void userMenu() throws IOException, InterruptedException {
        BufferedReader br = BufferReaderProvider.getBufferReader();
        while (true){
            System.out.println();
            System.out.println("*****************| Banking System |************************");
            System.out.println("1. create account");
            System.out.println("2. login account");
            System.out.println("3. Query account");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            try {
                int ch=Integer.parseInt(br.readLine());
                switch (ch){
                    case 1:
                        CreateAccount.createAccount();
                        break;
                    case 2:
                        if (LoginAccount.loginAccount()){
                            System.out.println("Login Successfully!....");
                            AccountHolderMenu.accountHolderMenu();
                        }else {
                            System.out.println("Invalid account number or password....");
                        }
                        break;
                    case 3:
                        QueryAccount.getAccount();
                        break;
                    case 4:
                        Exit.exit();
                        break;
                    default:
                        System.out.println("Invalid Choice! Try again...");
                }
            }catch (NumberFormatException e){
                System.out.println("Enter Integer Only...");
            }
        }
    }

}

