package com.example.month4_hw1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class three_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        EditText et = findViewById(R.id.text_view3);

        findViewById(R.id.go_2_act_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra(SecondActivity.TEXT_KEY, et.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}