package com.example.month4_hw1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class ChekLogin extends AppCompatActivity {
    private EditText login;
    private EditText password;
    private Button signIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_login);
        login = findViewById(R.id.login);
        password = findViewById(R.id.password);
        signIn = findViewById(R.id.sign_in_btn);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Не верный логин или пароль!", Toast.LENGTH_SHORT);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (login.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")){
                    Intent intent;
                    intent = new Intent(ChekLogin.this, SecondActivity.class);
                    startActivityForResult(intent, 1);
                }else{
                    toast.show();
                }
            }
        });


    }
}