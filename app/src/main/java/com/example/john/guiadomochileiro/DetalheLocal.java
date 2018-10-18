package com.example.john.guiadomochileiro;

import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DetalheLocal extends AppCompatActivity {

    private android.support.v4.app.FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_local);
        setTitle(" ");

        fragmentManager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.mapaDetalhe, new Mapa(), "Mapa");
        transaction.commitAllowingStateLoss();

    }

    public void autenticar(View view){
        Context contexto = getApplicationContext();
        String texto = "Local autenticado com sucesso";
        int duracao = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(contexto, texto,duracao);
        toast.show();
    }
    public void avaliar(View view) {
        Intent coment = new Intent(this, CadastrarComentario.class);
        startActivity(coment);
    }
}
