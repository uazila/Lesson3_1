package com.example.lesson3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity2 extends AppCompatActivity {
        private TextView textMassage;
        private TextView textTheme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        textMassage=findViewById(R.id.massege);
        String massage=getIntent().getStringExtra(MainActivity.KEY_FOR_INTENT);
        textMassage.setText(massage);

        textTheme=findViewById(R.id.theme);
        String theme=getIntent().getStringExtra(MainActivity.KEY_FOR_INTENT);
        textTheme.setText(theme);


    }
}