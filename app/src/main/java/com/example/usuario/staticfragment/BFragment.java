package com.example.usuario.staticfragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BFragment extends Fragment {

    TextView txv_Texto;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        txv_Texto = view.findViewById(R.id.txv_texto);
        return view;
    }

    public void changeTextAndSize(String Message, int size) {
        txv_Texto.setText(Message);
        txv_Texto.setTextSize(size);
    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("message", txv_Texto.getText().toString());
        outState.putFloat("size", txv_Texto.getTextSize() / getResources().getDisplayMetrics().scaledDensity);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (savedInstanceState != null) {
            txv_Texto.setText(savedInstanceState.getString("message"));
            txv_Texto.setTextSize(savedInstanceState.getFloat("size"));
        }
    }
}
