package com.example.appbeeuzer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class CaixaCalca extends AppCompatActivity {

    Button home9;
    Button contato1;
    Button caixa1;
    Button entrega1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caixa_calca);


        String[] arraySpinner = new String[]{
                "Genero", "Masculino", "Feminino"
        };
        Spinner s = (Spinner) findViewById(R.id.spgenero);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);


        arraySpinner = new String[]{
                "Tamanho", "P",  "M",  "G"
        };
        s = (Spinner) findViewById(R.id.sptamanho1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter1);


        arraySpinner = new String[]{
                "Cores", "Neutras", "Coloridas"
        };
        s = (Spinner) findViewById(R.id.spcores);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter2);




        home9=findViewById(R.id.btnhomeA);

        home9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Home();
            }
        });
        contato1=findViewById(R.id.btnsobrenosA);

        contato1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Contato();
            }
        });

        caixa1=findViewById(R.id.btncompraA);

        caixa1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Caixa();
            }
        });

        entrega1=findViewById(R.id.btnentregaA);

        entrega1.setOnClickListener(new View.OnClickListener() {

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

