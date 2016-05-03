package com.example.milan.teamproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    final Button login=(Button) findViewById(R.id.loginButton);
    final EditText user=(EditText) findViewById(R.id.userEditText);
    final EditText password=(EditText) findViewById(R.id.passwordEditText);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //final Intent intent=new Intent(this,ListOfArticles.class);

       /* login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(intent);
            }
        });*/
    }

}
