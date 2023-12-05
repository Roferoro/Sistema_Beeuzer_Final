package com.example.appbeeuzer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;



public class Login extends AppCompatActivity {
    private Button botao;
    private DatabaseHelper myDb;
    public final String PREFERENCES_NAME = "com.example.android.copa01";

    private String savedName;
    private String savedPass;

    private boolean manterLogado = false;
    CheckBox checkBox;

    TextView txtemail;
    TextView txtsenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        myDb = new DatabaseHelper(this);
        checkBox = findViewById(R.id.ckkboxManterConectado);

        txtemail = findViewById(R.id.edtNome5);
        txtsenha = findViewById(R.id.edtSenha);

        SharedPreferences settings = getSharedPreferences(PREFERENCES_NAME, 0);
        manterLogado = settings.getBoolean("logado", false);

        Log.v("ATIVO", manterLogado ? "sim": "não");

        if(manterLogado){
            checkBox.setChecked(true);
            savedName = settings.getString("email", "admin");
            savedPass = settings.getString("senha", "123");

            txtemail.setText(savedName);
            txtsenha.setText(savedPass);
        }

        checkBox.isChecked();

        botao  = findViewById(R.id.btnEntrar);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email = txtemail.getText().toString();
                String senha = txtsenha.getText().toString();

                Usuario user = new Usuario("", email, senha);

                boolean valido = myDb.usuarioExiste(user);

                if(!valido){
                    Toast.makeText(getApplicationContext(), "usuário inválido", Toast.LENGTH_SHORT).show();
                    return;
                }

                SharedPreferences settings = getSharedPreferences(PREFERENCES_NAME, 0);

                SharedPreferences.Editor editor = settings.edit();

                editor.putString("email", email);
                editor.putString("senha", senha);

                editor.commit();
                Intent intent = new Intent(Login.this,HomePage.class);
                startActivity(intent);
            }
        });
    }

    public void Cadastro(View v){
        Intent intent = new Intent(Login.this,Cadastro.class);
        startActivity(intent);
    }

   /*public void esqueciSenha(View v){
        Intent intent = new Intent(login.this, EsqueciSenha.class);
        startActivity(intent);
    }*/

    public void switchLogado(View v){
        manterLogado = checkBox.isChecked();

        SharedPreferences settings = getSharedPreferences(PREFERENCES_NAME, 0);

        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean("logado", manterLogado);
        editor.commit();
    }
    }


          /*

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);



            entrar = findViewById(R.id.btnEntrar);

            entrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Entrar();
                }
            });

        }

        public void Entrar() {
            Intent entrar = new Intent(this, HomePage.class);
            startActivity(entrar);

    }*/
