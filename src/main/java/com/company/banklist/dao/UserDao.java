package com.company.banklist.dao;

import java.util.List;

public interface UserDao<T> {

    List<T> findRichestUser();
}
