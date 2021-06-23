package com.example.ocorrencia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Listar extends AppCompatActivity {
    ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);
        getSupportActionBar().hide();

        l = findViewById(R.id.listInfracoes);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, infracoes());
        l.setAdapter(adapter);
    }

    public ArrayList<String> infracoes (){
        ArrayList<String> dados = new ArrayList();
        dados.add("The Nagasaki Lander is the trademarked name of several series of Nagasaki sport bikes, that started with the 1984 ABC800J");
        dados.add("The Nagasaki Lander is the trademarked name of several series of Nagasaki sport bikes, that started with the 1984 ABC800J");
        dados.add("Carbonite web goalkeeper gloves are ergonomically designed to give easy fit");
        dados.add("The Apollotech B340 is an affordable wireless mouse with reliable connectivity, 12 months battery life and modern design");
        dados.add("The automobile layout consists of a front-engine design, with transaxle-type transmissions mounted at the rear of the engine and four wheel drive");
        dados.add("Ergonomic executive chair upholstered in bonded black leather and PVC padded seat and back for all-day comfort and support");
        dados.add("Boston's most advanced compression wear technology increases muscle oxygenation, stabilizes active muscles");
        dados.add("The Football Is Good For Training And Recreational Purposes");
        dados.add("The Nagasaki Lander is the trademarked name of several series of Nagasaki sport bikes, that started with the 1984 ABC800J");
        dados.add("Ergonomic executive chair upholstered in bonded black leather and PVC padded seat and back for all-day comfort and support");
        dados.add("The Football Is Good For Training And Recreational Purposes");
        dados.add("The slim & simple Maple Gaming Keyboard from Dev Byte comes with a sleek body and 7- Color RGB LED Back-lighting for smart functionality");
        return dados;
    }
}