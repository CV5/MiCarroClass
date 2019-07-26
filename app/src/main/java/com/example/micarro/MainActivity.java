package com.example.micarro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MiCarro miCarro;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
textView = findViewById(R.id.textView);
        miCarro = new MiCarro("Rojo",2005,"Sonata N20");

        miCarro.setColor("verde");





    }

    public void enceder(View view) {
        miCarro.enceder();
    }

    public void acelelar(View view) {

        miCarro.Acelerar();
    }
}
