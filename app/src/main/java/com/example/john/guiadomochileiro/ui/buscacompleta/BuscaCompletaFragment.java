package com.example.john.guiadomochileiro.ui.buscacompleta;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.john.guiadomochileiro.R;

public class BuscaCompletaFragment extends Fragment {

    private BuscaCompletaViewModel mViewModel;

    public static BuscaCompletaFragment newInstance() {
        return new BuscaCompletaFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.busca_completa_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(BuscaCompletaViewModel.class);
        // TODO: Use the ViewModel
    }

}
