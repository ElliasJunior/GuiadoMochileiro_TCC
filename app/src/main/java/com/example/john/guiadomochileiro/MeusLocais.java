package com.example.john.guiadomochileiro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MeusLocais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_locais);
    }
    public void cadastrar(View view){
        Intent local = new Intent(this, CadastrarLocal.class);
        startActivity(local);
    }
    public void voltar(View view){
        finish();
    }
}
