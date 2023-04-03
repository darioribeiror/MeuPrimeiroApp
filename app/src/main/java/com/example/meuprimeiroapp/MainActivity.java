package com.example.meuprimeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Manipulando o console Logcat
        Log.i("MeuAPP", "Bem vindo ao android Studio!");

        // Setando variáveis ao componentes visuais
        Button botao = findViewById(R.id.MeuBotao);
        final TextView texto =findViewById(R.id.MeuTexto);

        // Evento de clique no botão
        botao.setOnClickListener(view -> texto.setText("Dario Ribeiro"));
    }
}