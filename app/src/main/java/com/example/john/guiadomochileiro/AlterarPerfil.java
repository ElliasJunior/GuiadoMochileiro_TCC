package com.example.john.guiadomochileiro;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AlterarPerfil extends AppCompatActivity {

    public static EditText usuario, email, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_perfil);
        setTitle(" ");
    }

    public void alterarPerfil(View view){

        EditText usuario = (EditText)findViewById(R.id.etUsuario);
        EditText email = (EditText)findViewById(R.id.etEmail);
        EditText senha = (EditText)findViewById(R.id.etSenha);
        String susuario = usuario.getText().toString();
        String semail = email.getText().toString();
        String ssenha = senha.getText().toString();


        if(usuario.getText().length() == 0){
            usuario.setError("Campo vazio");
        }
        if(email.getText().length() == 0){
            email.setError("Campo vazio");
        }
        if(senha.getText().length() == 0){
            senha.setError("Campo vazio");
        }

        if((susuario.length() > 4) && (semail.length() > 4) && (ssenha.length() > 4)) {
            Context contexto = getApplicationContext();
            String texto = "Usuário alterado com sucesso";
            int duracao = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
            finish();
        }
        else{
            Context contexto = getApplicationContext();
            String texto = "Dados informados incorretamente. Por favor verifique seus dados.";
            int duracao = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
        }
    }
}
