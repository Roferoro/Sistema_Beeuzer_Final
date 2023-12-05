package com.example.appbeeuzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Pagamentos extends AppCompatActivity {
    Button finalizar;
    Button home2;
    Button contato2;
    Button caixa2;
    Button entrega2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagamentos);



        home2=findViewById(R.id.btnhomeZ3);

        home2.setOnClickListener(view -> Home());

        contato2=findViewById(R.id.btnsobrenosC4);

        contato2.setOnClickListener(view -> Contato());

        caixa2=findViewById(R.id.btncaicaC4);

        caixa2.setOnClickListener(view -> Caixa());

        entrega2=findViewById(R.id.btnentregaC4);

        entrega2.setOnClickListener(view -> Entrega());

        finalizar=findViewById(R.id.btnfinalizar3);

        finalizar.setOnClickListener(view -> Finalizar());

    }


    public void Finalizar(){
        Intent finalizar = new Intent(this, Entrega.class);
        startActivity(finalizar);
        Toast.makeText(getApplicationContext(), "Compra Finalizada com Sucesso!", Toast.LENGTH_SHORT).show();
    }
    public void Home(){
        Intent home = new Intent(this, HomePage.class);
        startActivity(home);
    }

    public void Contato(){
        Intent contato = new Intent(this, SobreNos.class);
        startActivity(contato);
    }

    public void Caixa(){
        Intent caixa = new Intent(this, Compra.class);
        startActivity(caixa);
    }

    public void Entrega(){
        Intent entrega = new Intent(this, Entrega.class);
        startActivity(entrega);
    }
}