package com.company.banklist.dao;

import com.company.banklist.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao<User> {

    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<User> findRichestUser(){
        Session session = sessionFactory.getCurrentSession();
       return session.createQuery("select user from User user, Account account where user.userId = account.userId and account.account = (select max(account.account) from Account account)").list();
    }
}
