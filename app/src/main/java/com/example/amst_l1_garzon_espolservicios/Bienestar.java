package com.example.amst_l1_garzon_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Bienestar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienestar);
        Toast.makeText(getApplicationContext(), R.string.toastMsgBienestar, Toast.LENGTH_SHORT).show();
    }
}
