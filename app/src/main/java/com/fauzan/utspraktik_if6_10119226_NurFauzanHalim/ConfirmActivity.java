package com.fauzan.utspraktik_if6_10119226_NurFauzanHalim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/*
Jumat, 3 Juni 2022
10119226
Nur Fauzan Halim
IF6
*/

public class ConfirmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        ImageButton btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainActivity);
            }
        });

        Button btnSave = findViewById(R.id.btnSave);
        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent successDialog = new Intent(getApplicationContext(), SuccessDialog.class);
                startActivity(successDialog);
            }
        });
    }
}