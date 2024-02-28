package com.example.componentes_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity {

    private Button btnTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        mapearElementosInterface();
    }

    private void mapearElementosInterface() {
        btnTeste = findViewById(R.id.btn_teste);
        btnTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ScrollViewActivity.class);
                startActivity(intent);
            }
        });
    }
}