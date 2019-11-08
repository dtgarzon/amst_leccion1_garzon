package com.example.amst_l1_garzon_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    private Button btnSidweb,btnAcademico, btnVinculo,btnBienestar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSidweb =  findViewById(R.id.btnSidweb);
        btnAcademico =  findViewById(R.id.btnAcademico);
        btnVinculo =  findViewById(R.id.btnVinculo);
        btnBienestar =  findViewById(R.id.btnBienestar);

    }

    public void sidweb(View view) {
        Intent intent = new Intent(this, Sidweb.class);
        startActivity(intent);
    }

    public void academico(View view) {
        Intent intent = new Intent(this, Academico.class);
        startActivity(intent);
    }
    public void vinculo(View view) {
        Intent intent = new Intent(this, Vinculos.class);
        startActivity(intent);
    }
    public void bienestar(View view) {
        Intent intent = new Intent(this,Bienestar.class);
        startActivity(intent);
    }

    public void onClick(View v) {
        if(v.getId() == R.id.btnSidweb){
            Log.d("mensaje","ïngreso");
        }else if(v.getId() == R.id.btnSidweb) {
        }
        if(v.getId() == R.id.btnAcademico){
            Log.d("mensaje","ïngreso");
        }else if(v.getId() == R.id.btnAcademico) {
        }
        if(v.getId() == R.id.btnVinculo){
            Log.d("mensaje","ïngreso");
        }else if(v.getId() == R.id.btnVinculo) {
        }
        if(v.getId() == R.id.btnBienestar){
            Log.d("mensaje","ïngreso");
        }else if(v.getId() == R.id.btnBienestar) {
        }
    }

}