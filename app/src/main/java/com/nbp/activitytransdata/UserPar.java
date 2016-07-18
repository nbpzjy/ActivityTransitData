package com.nbp.activitytransdata;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * 比 Serializable的优势是可实现跨进程通信，并且不哟领反射，自身完成封装和解封装节省内存
 * Created by zjygzc on 16/7/18.
 */
public class UserPar implements Parcelable{

    private String account;
    private String password;
    private String emailid;

    private UserPar(Parcel in){

        account = in.readString();
        password = in.readString();
        emailid = in.readString();
    }


    //构造方法
    public UserPar(String account, String password, String emailid) {
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

    public int describeContents(){
        return 0;
    }

    public static final Creator<UserPar> CREATOR = new Creator<UserPar>() {
        @Override
        public UserPar createFromParcel(Parcel in) {
            return new UserPar(in);
        }

        @Override
        public UserPar[] newArray(int size) {
            return new UserPar[size];
        }
    };

    public void writeToParcel(Parcel out, int flags) {
        out.writeString(account);
        out.writeString(password);
        out.writeString(emailid);
    }

}
