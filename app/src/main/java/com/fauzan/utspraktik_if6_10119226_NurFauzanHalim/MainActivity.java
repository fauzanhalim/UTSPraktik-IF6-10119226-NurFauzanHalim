package com.fauzan.utspraktik_if6_10119226_NurFauzanHalim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*
Jumat, 3 Juni 2022
10119226
Nur Fauzan Halim
IF6
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent confirmActivity = new Intent(getApplicationContext(), ConfirmActivity.class);
                startActivity(confirmActivity);
            }
        });
    }
}