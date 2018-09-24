package com.example.john.guiadomochileiro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MeusComentarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_comentarios);
    }
    public void cadastrar(View view){
        Intent comentario = new Intent(this, CadastrarComentario.class);
        startActivity(comentario);
    }
    public void voltar(View view){
        finish();
    }
}
