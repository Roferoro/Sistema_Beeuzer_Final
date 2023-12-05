package com.example.appbeeuzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class CaixaCamisa extends AppCompatActivity {


    Button home1;
    Button contato1;
    Button caixa1;
    Button entrega1;
    Button carrinho;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caixa_camisa);

        String[] arraySpinner = new String[]{
                "Genero", "Masculino", "Feminino"
        };
        Spinner s = (Spinner) findViewById(R.id.spGenero);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);


        arraySpinner = new String[]{
                "Tamanho", "P",  "M",  "G"
        };
        s = (Spinner) findViewById(R.id.sptamanho);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter1);


        arraySpinner = new String[]{
                "Cores", "Neutras", "Coloridas"
        };
        s = (Spinner) findViewById(R.id.spcor);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter2);


        home1 = findViewById(R.id.btnhomeC);
        home1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Home();
            }
        });
        contato1 = findViewById(R.id.btnsobrenosC);

        contato1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Contato();
            }
        });

        caixa1 = findViewById(R.id.btncaicaC);

        caixa1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Caixa();
            }
        });

        entrega1 = findViewById(R.id.btnentregaC);

        entrega1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Entrega();
            }
        });

        carrinho = findViewById(R.id.btnComprarCamisa);

        carrinho.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Carrinho();
            }
        });

        String[] arraySpinner1 = new String[]{
                "Tamanho", "PP", "P", "M", "G", "GG"
        };


    }

    public void Home() {
        Intent home = new Intent(this, HomePage.class);
        startActivity(home);
    }

    public void Contato() {
        Intent contato = new Intent(this, SobreNos.class);
        startActivity(contato);
    }

    public void Caixa() {
        Intent caixa = new Intent(this, Compra.class);
        startActivity(caixa);
    }

    public void Entrega() {
        Intent entrega = new Intent(this, Entrega.class);
        startActivity(entrega);
    }

    public void Carrinho() {
        Intent carrinho = new Intent(this, Carrinho.class);
        startActivity(carrinho);
    }


}