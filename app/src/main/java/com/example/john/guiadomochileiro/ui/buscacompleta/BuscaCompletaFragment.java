package com.example.john.guiadomochileiro.ui.buscacompleta;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import com.example.john.guiadomochileiro.DetalheLocal;
import com.example.john.guiadomochileiro.Mapa;
import com.example.john.guiadomochileiro.R;
import com.example.john.guiadomochileiro.TelaInicial;

public class BuscaCompletaFragment extends Fragment {

    private BuscaCompletaViewModel mViewModel;

    public static BuscaCompletaFragment newInstance() {
        return new BuscaCompletaFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.busca_completa_fragment, container, false);
        return inflater.inflate(R.layout.busca_completa_activity, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(BuscaCompletaViewModel.class);
        // TODO: Use the ViewModel
    }

    /*public void buscaLocal(View view){
        Context contexto = getApplicationContext();
        String texto = "Busca não finalizada";
        int duracao = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(contexto, texto,duracao);
        toast.show();
    }

    public void detalheLocal(View view){
    }*/

}
