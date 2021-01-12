package com.company.banklist.service;

import com.company.banklist.dao.AccountDao;
import com.company.banklist.dao.UserDao;
import com.company.banklist.entity.Account;
import com.company.banklist.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    
    private AccountDao<Account> accountDao;
    private UserDao<User> userDao;

    @Autowired
    public void setAccountDao(AccountDao<Account> accountDao) {
        this.accountDao = accountDao;
    }

    @Autowired
    public void setUserUserDao(UserDao<User> userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public List<User> findRichestUser(){
        return userDao.findRichestUser();
    }

    @Transactional
    public Long sum() {
        return accountDao.sum();
    }
}
