package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtCounter=findViewById(R.id.txt_view);
        Button button =findViewById(R.id.btn_counter1);
        Button button1=findViewById(R.id.btn_counter2);
        Button button2=findViewById(R.id.btn_Reset);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                counter++;
                txtCounter.setText(counter+"");

            }

        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=counter-1;
                txtCounter.setText(counter+"");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=0;
                txtCounter.setText(counter+"");
            }
        });
    }
}