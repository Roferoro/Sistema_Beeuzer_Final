package com.example.appbeeuzer;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SobreNos extends AppCompatActivity {


    Button home1;
    Button contato1;
    Button caixa1;
    Button entrega1;

    Button btnw;
    Button btninsta;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre_nos);



        btnw = findViewById(R.id.btnw);
        btnw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirWhats();

            }
        });

        btninsta = findViewById(R.id.btninsta);
        btninsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirInsta();
            }
        });

        home1=findViewById(R.id.btnHome1);

        home1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Home();
            }
        });
        contato1=findViewById(R.id.btnContato1);

        contato1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Contato();
            }
        });

        caixa1=findViewById(R.id.btnCaixa2);

        caixa1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Caixa();
            }
        });

       entrega1=findViewById(R.id.btnEntrega1);

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
    private void abrirInsta(){
        String NomUsu = "beeuzer";
        Uri uri = Uri.parse("https://www.instagram.com/beeuzer/" + NomUsu);
        Intent linkIns = new Intent(Intent.ACTION_VIEW, uri);
        linkIns.setPackage("com.instagram.android");

        try{
            startActivity(linkIns);
        }catch (Exception e){
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/" + NomUsu)));
        }
    }

    private void abrirWhats(){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        String numB = getString(R.string._11910392515);
        intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=" + numB));
        startActivity(intent);
    }




}