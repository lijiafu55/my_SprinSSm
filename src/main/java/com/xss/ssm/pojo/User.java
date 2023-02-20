package com.xss.ssm.pojo;

/*
  @ 2023， 02， 11， 22，17
  @ 15303  springSSM
  @ 15303  com.xss.ssm.pojo 22:17
*/
public class User {
    private String username;

    private String password;
    private Integer userid;
    private String email;

    private Integer phone;


    public User() {
    }

    public User(String username, String password, Integer userid, String email, Integer phone) {
        this.username = username;
        this.password = password;
        this.userid = userid;
        this.email = email;
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}
