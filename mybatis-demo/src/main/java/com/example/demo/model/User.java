package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private long id;
    private String name;
    private String sex;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //在输出的Json数据中隐藏密码，只能输入不输出
    private String password;

    private String role;

    public User(long id, String name, String sex, String password, String role) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.password = password;
        this.role = role;
    }

    public User() {
        super();
    }

    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getsex() {
        return sex;
    }
    public void setsex(String sex) {
        this.sex = sex;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}
