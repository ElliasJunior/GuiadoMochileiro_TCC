package com.example.john.guiadomochileiro;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CadastrarComentario extends AppCompatActivity {

    public static EditText comentario, dtvisita;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_comentario);

        /*EditText edComentario = (EditText) findViewById(R.id.etComentario);
        EditText edDtvisita = (EditText) findViewById(R.id.edDtVisita);

        if(edComentario.getText().length() == 0){
            edComentario.setError("Campo vazio");
        }
        if(edDtvisita.getText().length() == 0){
            edDtvisita.setError("Campo vazio");
        }

        if((comentario.length() > 2) && (dtvisita.length() > 2)) {
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
        }*/
    }
}
