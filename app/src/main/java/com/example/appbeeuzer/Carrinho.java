package com.example.appbeeuzer;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Carrinho extends AppCompatActivity {

    Button pagamento1;
    Button home1;
    Button contato1;
    Button caixa1;
    Button entrega1;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);


        pagamento1=findViewById(R.id.btnPagamento2);

        pagamento1.setOnClickListener(view -> Pagamento());

        home1=findViewById(R.id.btnhome2);

        home1.setOnClickListener(view -> Home());

        contato1=findViewById(R.id.btnsobrenos);

        contato1.setOnClickListener(view -> Contato());

        caixa1=findViewById(R.id.btncomprar);

        caixa1.setOnClickListener(view -> Caixa());

        entrega1=findViewById(R.id.btnentrega);

        entrega1.setOnClickListener(view -> Entrega());



    }
    public void Pagamento(){
        Intent pagamento = new Intent(this, Pagamentos.class);
        startActivity(pagamento);
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
