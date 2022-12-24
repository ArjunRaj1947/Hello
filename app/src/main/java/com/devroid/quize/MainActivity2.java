package com.devroid.quize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txt2;
    Button btn_next2;
    Button btn_previous2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt2=findViewById(R.id.txt2);
        btn_next2=findViewById(R.id.btn_next2);
        btn_previous2=findViewById(R.id.btn_previous2);

        txt2.setText("Q 2 - What is ADB in android?\n" + "\n" + "Ans- Android Debug Bridge");

        btn_next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });
        btn_previous2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}