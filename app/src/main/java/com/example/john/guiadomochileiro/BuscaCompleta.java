package com.example.john.guiadomochileiro;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.john.guiadomochileiro.ui.buscacompleta.BuscaCompletaFragment;

public class BuscaCompleta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.busca_completa_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, BuscaCompletaFragment.newInstance())
                    .commitNow();
        }
    }

    public void buscaLocal(View view){
        Context contexto = getApplicationContext();
        String texto = "Busca não desenvolvida";
        int duracao = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(contexto, texto,duracao);
        toast.show();
    }

    public void detalheLocal(View view){
        Intent dlocal = new Intent(this, DetalheLocal.class);
        startActivity(dlocal);
    }
}
