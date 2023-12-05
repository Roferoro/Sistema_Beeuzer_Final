package com.example.appbeeuzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogCad extends AppCompatActivity {
Button login;
Button cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_cad);

        login=findViewById(R.id.btnLogin);
        cadastro=findViewById(R.id.btnCad);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Login();
            }
        });
             cadastro.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     Cadastro();
                 }
             });

    }
    public void Login(){
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }

    public void Cadastro(){
        Intent cadastro = new Intent(this, Cadastro.class);
        startActivity(cadastro);
    }

    }
