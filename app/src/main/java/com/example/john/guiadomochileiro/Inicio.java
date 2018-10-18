package com.example.john.guiadomochileiro;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        setTitle(" ");
    }

    public void buscaLocal(View view){
        Context contexto = getApplicationContext();
        String texto = "Busca não finalizada";
        int duracao = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(contexto, texto,duracao);
        toast.show();
    }
    public void detalheLocal(View view){
        Intent detalhe = new Intent(this, DetalheLocal.class);
        startActivity(detalhe);
    }
}
