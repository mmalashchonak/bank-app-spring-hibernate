package com.company.banklist.entity;


import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @Column(name = "accountId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;

    @Column(name = "account")
    private int account;

    @Column(name = "userId")
    private int userId;

    public Account(){}

    public Account(int account, int userId) {
        this.account = account;
        this.userId = userId;
    }

    public Account(int accountId, int account, int userId) {
        this.accountId = accountId;
        this.account = account;
        this.userId = userId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", account=" + account +
                ", userId=" + userId +
                '}';
    }
}
