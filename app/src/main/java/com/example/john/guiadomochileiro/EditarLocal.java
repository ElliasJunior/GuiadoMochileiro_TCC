package com.example.john.guiadomochileiro;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class EditarLocal extends AppCompatActivity {

    private String[] categoriasNome = new String[]{"Parque","Praça","Trilha","Praia","Lago","Diversos"};

    private Spinner sp;

    public static EditText nome, descricao, latitude, longetude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_local);
        setTitle(" ");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categoriasNome);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        sp = (Spinner) findViewById(R.id.spinner);
        sp.setAdapter(adapter);


    }
    public void editar(View view){
        EditText edNome = (EditText) findViewById(R.id.etNome);
        EditText edDescricao = (EditText) findViewById(R.id.etDecricao);
        EditText edLatitude = (EditText) findViewById(R.id.etLatitude);
        EditText edLongetude = (EditText) findViewById(R.id.etLongetude);
        String nome = edNome.getText().toString();
        String descricao = edDescricao.getText().toString();
        String latitude = edLatitude.getText().toString();
        String longetude = edLongetude.getText().toString();

        if(edNome.getText().length() == 0){
            edNome.setError("Campo vazio");
        }
        if(edDescricao.getText().length() == 0){
            edDescricao.setError("Campo vazio");
        }
        if(edLatitude.getText().length() == 0){
            edLatitude.setError("Campo vazio");
        }
        if(edLongetude.getText().length() == 0){
            edLongetude.setError("Campo vazio");
        }
        if((nome.length() > 2) && (descricao.length() > 2) && (latitude.length() > 2) && (longetude.length() > 2)) {
            Context contexto = getApplicationContext();
            String texto = "Local alterado com sucesso";
            int duracao = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
            finish();
        }
        else{
            Context contexto = getApplicationContext();
            String texto = "Dados informados incorretamente. Por favor verifique as informações.";
            int duracao = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(contexto, texto,duracao);
        }
    }
    public void visualizarLocal(View view){
        Intent dlocal = new Intent(this, DetalheLocal.class);
        startActivity(dlocal);
    }
}
