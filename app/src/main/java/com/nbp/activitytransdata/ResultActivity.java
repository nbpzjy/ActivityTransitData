package com.nbp.activitytransdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView mAccount;
    private TextView mPassword;
    private TextView mEmailid;

   // private User user;
    private UserPar userPar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        mAccount = (TextView)findViewById(R.id.result_account);
        mPassword = (TextView)findViewById(R.id.result_password);
        mEmailid = (TextView)findViewById(R.id.result_email);
//用intent方式也可以直接传递多个数值，需要区分每一个String名，这里初始化三个content来接收数据
//        String content_acc = "";
//        String content_pss = "";
//        String content_eml = "";


        //获得intent
        Intent intent = getIntent();

        //新建一个bundle来获得intent中携带的bundle
        Bundle bundle = intent.getBundleExtra("data");

        //user对象来取得bundle中序列化的数据名字user必须与manactivity封装时的名字一样，否则无法获得数据
//        user = (User)bundle.getSerializable("user");

        //userPar对象来提取bundle中的名字叫userPar的对象，强制转为UserPar对象
        userPar = bundle.getParcelable("userpar");

//只用intent来专递时单个数据的获取
//        content_acc = bundle.getString("Account");
//        content_pss = bundle.getString("Password");
//        content_eml = bundle.getString("Emailid");


        //给textview设定取得的数据
//        mAccount.setText(content_acc);
//        mPassword.setText(content_pss);
//        mEmailid.setText(content_eml);

//给textview设定取得的数据，直接用user对象中的各个属性获得方式，由构造方法定义
//        mAccount.setText(user.getAccount());
//        mPassword.setText(user.getPassword());
//        mEmailid.setText(user.getEmailid());


        mAccount.setText(userPar.getAccount());
        mPassword.setText(userPar.getPassword());
        mEmailid.setText(userPar.getEmailid());






    }
}
