package com.example.fragments.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragments.R;

public class ConversasFragment extends Fragment implements View.OnClickListener {

    private Context context;
    private TextView txtTitulo;
    private Button btnCadastrar;
    private EditText edtNome;
    private TextView txtNome;

    public ConversasFragment() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("TESTE", "Invocou o método onCreate() do fragment ConversasFragment()!");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        /**
         * Método invocado quando o fragment é criado
         */
        Log.i("TESTE", "Invocou o método onCreateView() do fragment ConversasFragment()!");
        View view = inflater.inflate(R.layout.fragment_conversas, container, false);
        context = view.getContext();
        /**
         * no meu fragment eu posso acessar os elementos de layout
         * por meio do objeto view, acessando pelo método findViewById
         */
        txtTitulo = view.findViewById(R.id.txt_titulo_fragment_conversas);
        edtNome = view.findViewById(R.id.edt_nome);
        btnCadastrar = view.findViewById(R.id.btn_cadastrar);
        txtNome = view.findViewById(R.id.txt_nome_informado);
        txtTitulo.setText("Tela com listagem das conversas");
        btnCadastrar.setOnClickListener(this);
        Button btnIrTelaChamados = view.findViewById(R.id.btn_teste_ir_fragment_chamados);
        btnIrTelaChamados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundlePassarDadosFragmentChamados = new Bundle();
                bundlePassarDadosFragmentChamados.putString("teste", "Texto passado como teste!");
                bundlePassarDadosFragmentChamados.putInt("teste_valor_inteiro", 12);
                bundlePassarDadosFragmentChamados.putBoolean("teste_boolean", true);
                ChamadosFragment chamadosFragment = new ChamadosFragment();
                chamadosFragment.setArguments(bundlePassarDadosFragmentChamados);
                getParentFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container_view, chamadosFragment)
                        .commit();
            }
        });

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        /**
         * O método onAttach é invocado quando o fragment
         * é anexado na activity
         */
        Log.i("TESTE", "Invocou o método onAttach() do fragment ConversasFragment!");
    }

    @Override
    public void onStart() {
        super.onStart();
        /**
         * Método invocado quando o fragment é startado, pode ser invocado
         * para buscar dados por meio de uma requisição http
         * para uma api
         */
        Log.i("TESTE", "Invocou o método onStart() do fragment ConversasFragment()!");
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if (id == R.id.btn_cadastrar) {
            String nome = edtNome.getText().toString();

            if (nome.isEmpty()) {
                Toast.makeText(context, "Informe o seu nome!", Toast.LENGTH_LONG)
                        .show();
            } else {
                txtNome.setText("Nome:" + nome);
            }

            Log.i("NOME", edtNome.getText().toString());
        }

    }
}