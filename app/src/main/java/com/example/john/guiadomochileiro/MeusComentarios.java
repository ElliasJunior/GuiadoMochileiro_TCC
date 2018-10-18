package com.example.john.guiadomochileiro;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MeusComentarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_comentarios);
        setTitle(" ");
    }

    public void buscarComentarios(View view){
        Context contexto = getApplicationContext();
        String texto = "Busca não desenvolvida";
        int duracao = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(contexto, texto,duracao);
        toast.show();
    }
    public void editarComentario(View view){
        Intent dcomentario = new Intent(this, EditarComentario.class);
        startActivity(dcomentario);
    }
    public void cadastrar(View view){
        Intent comentario = new Intent(this, CadastrarComentario.class);
        startActivity(comentario);
    }
    public void voltar(View view){
        finish();
    }
}
