package com.example.appbeeuzer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    DatabaseHelper myDb;
    Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        myDb = new DatabaseHelper(this);
        cadastrar = findViewById(R.id.btnCadastrar);
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cadastrar();
            }
        });
    }

    public void login(View v){
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }

    public void cadastrar(){
        TextView txtUserName, txtEmail, txtSenha;

        txtUserName = findViewById(R.id.edtNome1);
        txtEmail = findViewById(R.id.edtEmail);
        txtSenha = findViewById(R.id.edtSenha1);

        String nome = txtUserName.getText().toString(),
                email = txtEmail.getText().toString(),
                senha = txtSenha.getText().toString();


        Usuario user = new Usuario(nome, email, senha);

        myDb.allUsers();
        boolean success = myDb.insertUser(user);
        if(success){
            login(null);
        }
        else{
            Toast.makeText(this, "Erro ao cadastrar", Toast.LENGTH_SHORT).show();
        }

    }
}