package com.example.appbeeuzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Compra extends AppCompatActivity {

    Button home2;
    Button contato2;
    Button caixa2;
    Button entrega2;
    Button caixaCamisa;

    Button caixaCalca;
    Button caixaDoacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compra);

        home2=findViewById(R.id.btnHome2);

        home2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Home();
            }
        });

        caixaDoacao=findViewById(R.id.btnCompDoacao);

        caixaDoacao.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {CaixaDoacao();
            }
        });

        caixaCalca=findViewById(R.id.btnCompCalca);

        caixaCalca.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {CaixaCalca();
            }
        });

        caixaCamisa=findViewById(R.id.btnCompCamisa);

        caixaCamisa.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                CaixaCamisa();
            }
        });
        contato2=findViewById(R.id.btnContato2);

        contato2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Contato();
            }
        });

        caixa2=findViewById(R.id.btnCaixa1);

        caixa2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Caixa();
            }
        });

        entrega2=findViewById(R.id.btnEntrega2);

        entrega2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Entrega();
            }
        });
    }

    public void CaixaDoacao(){
        Intent caixadoacao = new Intent(this, CaixaDoacao.class);
        startActivity(caixadoacao);
    }
    public void CaixaCalca(){
        Intent caixacalca = new Intent(this, CaixaCalca.class);
        startActivity(caixacalca);
    }

    public void CaixaCamisa(){
        Intent caixacamisa = new Intent(this, CaixaCamisa.class);
        startActivity(caixacamisa);
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

    public void Entrega() {
        Intent entrega = new Intent(this, Entrega.class);
        startActivity(entrega);

    }

}