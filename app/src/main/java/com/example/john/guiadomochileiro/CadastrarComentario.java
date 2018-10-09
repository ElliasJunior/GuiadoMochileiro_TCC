package com.example.john.guiadomochileiro;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CadastrarComentario extends AppCompatActivity {

    public static EditText comentario, dtvisita;
    Spinner avaliacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_comentario);

        avaliacao = (Spinner) findViewById(R.id.spAvaliacao);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.spinner_avaliacao, android.R.layout.simple_spinner_item);
        avaliacao.setAdapter(adapter);
    }
    public void cadastrarComentario(View view){
        EditText edComentario = (EditText) findViewById(R.id.etComentario);
        EditText edDtvisita = (EditText) findViewById(R.id.edDtVisita);
        String comentario = edComentario.getText().toString();
        String dtvisita = edDtvisita.getText().toString();

        if(edComentario.getText().length() == 0){
            edComentario.setError("Campo vazio");
        }
        if(edDtvisita.getText().length() == 0){
            edDtvisita.setError("Campo vazio");
        }

        if((comentario.length() > 4) && (dtvisita.length() > 4)) {
            Context contexto = getApplicationContext();
            String texto = "Comentário cadastrado com sucesso";
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
}
