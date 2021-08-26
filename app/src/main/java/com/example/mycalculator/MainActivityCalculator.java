package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityCalculator extends AppCompatActivity {
    private Button btn_0;
    private Button btn_1;
    private Button btn_2;
    private Button btn_3;
    private Button btn_4;
    private Button btn_5;
    private Button btn_6;
    private Button btn_7;
    private Button btn_8;
    private Button btn_9;
    private Button btn_dot;
    private Button btn_equal;
    private Button btn_plus;
    private Button btn_minus;
    private Button btn_multiplication;
    private Button btn_divide;
    private Button btn_percent;
    private Button btnPlusMinus;
    private Button btn_delete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid);

        findByIds();
        this.btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (savedInstanceState == null){

                }

            }
        });

        this.btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btnPlusMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        this.btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


    private void findByIds() {
        this.btn_0 = findViewById(R.id.key_0);
        this.btn_1 = findViewById(R.id.key_1);
        this.btn_2 = findViewById(R.id.key_2);
        this.btn_3 = findViewById(R.id.key_3);
        this.btn_4 = findViewById(R.id.key_4);
        this.btn_5 = findViewById(R.id.key_5);
        this.btn_6 = findViewById(R.id.key_6);
        this.btn_7 = findViewById(R.id.key_7);
        this.btn_8 = findViewById(R.id.key_8);
        this.btn_9 = findViewById(R.id.key_9);
        this.btn_dot = findViewById(R.id.key_dot);
        this.btn_equal = findViewById(R.id.key_equal);
        this.btn_plus = findViewById(R.id.key_plus);
        this.btn_minus = findViewById(R.id.key_minus);
        this.btn_multiplication = findViewById(R.id.key_multiply);
        this.btn_divide = findViewById(R.id.deleted);
        this.btn_percent = findViewById(R.id.key_percent);
        this.btnPlusMinus = findViewById(R.id.key_plus_minus);
        this.btn_delete = findViewById(R.id.key_del);
    }
}