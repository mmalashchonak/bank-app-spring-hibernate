package com.company.banklist.service;

import com.company.banklist.entity.User;

import java.util.List;

public interface Service {
     Long sum();
     List<User> findRichestUser();
}
