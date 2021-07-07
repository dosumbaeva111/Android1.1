package com.example.month4_hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    public static final String TEXT_KEY = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        TextView text = findViewById(R.id.text_tw);
        findViewById(R.id.btn_2act).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, three_activity.class);
                intent.putExtra(TEXT_KEY, text.getText().toString());
                startActivityForResult(intent, 1);
            }
        });


    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView textView = (TextView) findViewById(R.id.text_tw);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String accessMessage = data.getStringExtra(TEXT_KEY);
                textView.setText(accessMessage);
            }
        }
    }
}
