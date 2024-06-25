package com.system.entity;

public class User {
    private int accountNumber;
    private String name;
    private int age;
    private long mobileNo;
    private String Address;
    private String password;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public User(int accountNumber, String name, int age, long mobileNo, String address, String password) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
        Address = address;
        this.password = password;
    }

    public User(String name, int age, long mobileNo, String address, String password) {
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
        Address = address;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mobileNo=" + mobileNo +
                ", Address='" + Address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
