package com.company.banklist.dao;

import com.company.banklist.entity.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao<Account> {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Long sum() {
        Session session = sessionFactory.getCurrentSession();
        return (Long) session.createQuery("select sum(a.account) from Account a").list().get(0);
    }
}