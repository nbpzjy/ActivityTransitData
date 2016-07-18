package com.nbp.activitytransdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mAccountEt;
    private EditText mPasswordEt;
    private EditText mEmailEt;

    private User user;

    private UserPar userPar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAccountEt = (EditText) findViewById(R.id.et_account);
        mPasswordEt = (EditText) findViewById(R.id.et_password);
        mEmailEt = (EditText) findViewById(R.id.et_email);





    }

    public void Next (View view){

        String account = mAccountEt.getText().toString();
        String password = mPasswordEt.getText().toString();
        String emailid = mEmailEt.getText().toString();

        if(account != null && account.length() > 0 && password != null &&
                password.length() > 0 && emailid != null && emailid.length() > 0) {

            Intent intent = new Intent(MainActivity.this,ResultActivity.class);

//            user = new User(account,password,emailid);
            userPar = new UserPar(account,password,emailid);

            Bundle bundle = new Bundle();
//            bundle.putString("Account", account);
//            bundle.putString("Password",password);
//            bundle.putString("Emailid",emailid);

            //用 Serializable+bundle实现的数据传递
//            bundle.putSerializable("user",user);
//            intent.putExtra("data",bundle);

            //用Parcelable来实现


            bundle.putParcelable("userpar",userPar);
            intent.putExtra("data",bundle);
            startActivity(intent);


        }else {
            Toast.makeText(MainActivity.this,"Somewhere input wrong",Toast.LENGTH_LONG).show();
        }
    }

    public void errorShow(View view) {

        mAccountEt.setError("账号不对！");
        mPasswordEt.setError("密码不对！");
        mEmailEt.setError("邮箱地址不对！");
    }
}
