package com.example.john.guiadomochileiro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TodosUsuarios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todos_usuarios);
    }
    public void voltar(View view){
        finish();
    }
}
