package com.example.usuario.staticfragment;


import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements AFragment.FragmentAListener{

    private Fragment fragmentb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentb=getSupportFragmentManager().findFragmentById(R.id.fragmentB);
    }

    @Override
    public void OnFragmentAEvent(String message, int size) {
        ((BFragment)fragmentb).changeTextAndSize(message,size);
    }
}
