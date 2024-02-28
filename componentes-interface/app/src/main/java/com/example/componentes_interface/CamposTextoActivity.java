package com.example.componentes_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CamposTextoActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCadastrar;
    private EditText edtNome;
    private EditText edtEmail;
    private EditText edtSenha;
    private EditText edtSobre;
    private EditText edtDataNascimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campos_texto);
        btnCadastrar = findViewById(R.id.btn_cadastrar);
        edtNome = findViewById(R.id.edt_nome);
        edtEmail = findViewById(R.id.edt_email);
        edtSenha = findViewById(R.id.edt_senha);
        edtSobre = findViewById(R.id.edt_sobre);
        edtDataNascimento = findViewById(R.id.edt_data_nascimento);
        btnCadastrar.setOnClickListener(this);
    }

    private void apresentarDadosUsuario() {

        try {
            String nome = edtNome.getText().toString();
            String email = edtEmail.getText().toString();
            String dataNascimento = edtDataNascimento.getText().toString();
            String senha = edtSenha.getText().toString();
            String sobre = edtSobre.getText().toString();

            if (nome.isEmpty() || email.isEmpty()
            || senha.isEmpty() || dataNascimento.isEmpty()
            || sobre.isEmpty()) {
                Toast.makeText(getApplicationContext(), "Informe todos os campos!", Toast.LENGTH_LONG)
                        .show();
            } else {
                System.out.println(nome);
                System.out.println(email);
                System.out.println(dataNascimento);
                System.out.println(senha);
                System.out.println(sobre);
            }

        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Ocorreu o seguinte erro: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onClick(View view) {
        apresentarDadosUsuario();
    }
}