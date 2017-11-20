package com.example.usuario.staticfragment;


import android.app.Activity;

import android.app.Fragment;
import android.os.Bundle;

public class MainActivity extends Activity implements AFragment.FragmentAListener{

    private Fragment fragmentb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentb=getFragmentManager().findFragmentById(R.id.fragmentB);
    }

    @Override
    public void OnFragmentAEvent(String message, int size) {
        ((BFragment)fragmentb).changeTextAndSize(message,size);
    }
}
