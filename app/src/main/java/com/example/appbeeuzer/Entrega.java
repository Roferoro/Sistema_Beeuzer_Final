package com.example.appbeeuzer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Entrega extends AppCompatActivity {

    Button home;
    Button contato;
    Button caixa;
    Button entrega;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrega);

        home=findViewById(R.id.btnhome4);

        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Home();
            }
        });
        contato=findViewById(R.id.btnsobrenos4);

        contato.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Contato();
            }
        });

        caixa=findViewById(R.id.btncomprar4);

        caixa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Caixa();
            }
        });

        entrega=findViewById(R.id.btnentrega4);

        entrega.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Entrega();
            }
        });
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

