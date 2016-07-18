package com.nbp.activitytransdata;

import java.io.Serializable;

/**
 * Created by zjygzc on 16/7/18.
 */
public class User implements Serializable{

    private String account;
    private String password;
    private String emailid;


    //构造方法
    public User(String account, String password, String emailid) {
        this.account = account;
        this.password = password;
        this.emailid = emailid;
    }


    //get/set方法
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
}
