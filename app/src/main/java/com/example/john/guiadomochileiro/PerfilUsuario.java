package com.example.john.guiadomochileiro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PerfilUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_usuario);
        setTitle(" ");
    }

    public void alterarDados(View view){
        Intent alterar = new Intent(this, AlterarPerfil.class);
        startActivity(alterar);
    }

    public void locais(View view){
        Intent locais = new Intent(this, MeusLocais.class);
        startActivity(locais);
    }

    public void comentarios(View view){
        Intent comentario = new Intent(this, MeusComentarios.class);
        startActivity(comentario);
    }

    public void voltar(View view){
        finish();
    }
}
