package com.example.john.guiadomochileiro;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MeusLocais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_locais);
    }
    public void buscarLocal(View view){
        Context contexto = getApplicationContext();
        String texto = "Busca não desenvolvida";
        int duracao = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(contexto, texto,duracao);
        toast.show();
    }
    public void editarLocal(View view){
        Intent dlocal = new Intent(this, DetalheLocal.class);
        startActivity(dlocal);
    }
    public void cadastrar(View view){
        Intent local = new Intent(this, CadastrarLocal.class);
        startActivity(local);
    }
    public void voltar(View view){
        finish();
    }
}
