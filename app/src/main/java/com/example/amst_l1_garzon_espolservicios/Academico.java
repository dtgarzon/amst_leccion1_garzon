package com.example.amst_l1_garzon_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Academico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academico);
        Toast.makeText(getApplicationContext(), R.string.toastMsgAcamedico, Toast.LENGTH_SHORT).show();

    }
}
