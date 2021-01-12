package com.company.banklist.entity;


import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private int userId;

    @Column(name = "name")
    private String name;

    @Column(name = "sureName")
    private String sureName;

    public User() {};

    public User(String name, String sureName) {
        this.name = name;
        this.sureName = sureName;
    }

    public User(int userId, String name, String sureName) {
        this.userId = userId;
        this.name = name;
        this.sureName = sureName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }
}
