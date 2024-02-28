package com.app.colecoes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.app.colecoes.classes_internas.Anonima;
import com.app.colecoes.classes_internas.Externa;
import com.app.colecoes.teste.ListaTelefonica;
import com.app.colecoes.teste.Pessoa;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnTeste;
    private TextView txtTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTeste = findViewById(R.id.btn_teste);
        txtTeste = findViewById(R.id.txt_teste);
        txtTeste.setText("Ainda não possui texto...");
        btnTeste.setOnClickListener(this);
        testeTelefones();
        testeArrays();
        testeListas();
        testeMetodoFilter();
        testarMetodoMap();
        testeOrdenarLista();
    }

    private void apresentarToast(String mensagem) {
        /**
         * para apresentar um toast(um alertinha), basta
         * invocar o método makeText() da classe Toast
         * passando como argumento o contexto, a mensagem
         * e o tempo que o toast vai ficar sendo apresentado na tela,
         * em seguida, invocar o método show(), o método makeText()
         * retorna um objeto da classe Toast e a partir desse objeto
         * é possível invocar o método show().
         */
        Toast.makeText(getApplicationContext(), mensagem, Toast.LENGTH_LONG)
                .show();
    }

    private void testeClassesInternas() {

        try {
            Externa externa = new Externa();
            externa.setTextoExterno("Apresentando texto da classe externa!");
            externa.apresentarTextoExterno();
            Externa.Interna interna = new Externa.Interna();
            interna.setTextoInterno("Apresentando texto da classe interna!");
            interna.apresentarTextoInterno();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private void testeClasseAnonima() {
        Anonima anonima = new Anonima();
        anonima.teste();
        Anonima anonima2 = new Anonima() {
            @Override
            public void teste() {
                System.out.println("sobreescrevendo o método teste na classe anônima!");
            }
        };
        anonima2.teste();
    }

    private void testeTelefones() {
        ListaTelefonica listaTelefonica = new ListaTelefonica();
        listaTelefonica.adicionarTelefone("(14) 99877-5677");
        listaTelefonica.adicionarTelefone("(14) 99877-6543");
        listaTelefonica.adicionarVariosTelefones(
                "(14) 99877-9876",
                "(14) 99877-0987",
                "(14) 99867-0986"
        );
        List<String> telefones = listaTelefonica.getTelefones();

        for (String telefone : telefones) {
            System.out.println("Telefone: " + telefone);
        }

    }

    private void testeArrays() {

        try {
            String[] nomes = new String[10];
            Array.set(nomes, 0, "Gabriel");
            Array.set(nomes, 1, "Marta");
            Array.set(nomes, 2, "Fernando");
            System.out.println(nomes[0]);
            System.out.println(nomes[1]);
            System.out.println(nomes[2]);
            System.out.println("Tamanho array de nomes: " + nomes.length);
            System.out.println(Array.get(nomes, 0));
            /**
             * Arrays.asList(array) -> converte um array em uma List<Tipo>
             */
            List<String> listaNomes = Arrays.asList(nomes);
            listaNomes.forEach((nome) -> {

                if (nome != null) {
                    System.out.println("Nome da lista: " + nome);
                }

            });
            System.out.println(Array.get(nomes, 11));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private void testeListas() {

        try {
            List<String> nomes = new ArrayList<>();
            Set<Integer> idades = new HashSet<>();
            Map<String, String> pessoas = new HashMap<>();
            // método add(elemento) -> adicionar elementos na lista
            // em uma lista do tipo HashSet eu não posso adicionar elementos repetidos
            nomes.add("Gabriel");
            nomes.add("Maria");
            idades.add(23);
            idades.add(22);
            /**
             * no caso de tentar adicionar um elemento repetido
             * no HashSet, não vai ser lançada exceção, o elemento
             * simplesmente não será adicionado a lista
             */
            idades.add(22);
            // método put(chave, valor) -> adicionar elementos em um HashMap
            pessoas.put("Gabriel", "Masculino");
            pessoas.put("Marta", "Feminino");
            pessoas.put("Eduardo", "Masculino");

            for (String nome : nomes) {
                System.out.println("Nome no ArrayList: " + nome);
            }

            for (Integer idade : idades) {
                System.out.println("Idade do HashSet: " + idade);
            }

            pessoas.forEach((nome, sexo) -> {
                System.out.println(nome + " é do sexo " + sexo);
            });

            // ArrayList -> obter elemento com o método get(indice)
            String primeiroNome = nomes.get(0);
            String segundoNome = nomes.get(1);
            System.out.println("Primeiro nome: " + primeiroNome);
            System.out.println("Segundo nome: " + segundoNome);

            /**
             * no HashSet eu não possuo o método get(),
             * para acessar os elementos eu devo acessar
             * por meio do foreach
             */
            for (int idade : idades) {
                System.out.println(idade);
            }

            // método remove() tanto no HashSet como no ArrayList remove um elemento
            nomes.remove(0);
            nomes.forEach((nome) -> {
                System.out.println("" + nome);
            });

            nomes.add("Pedro");
            nomes.add("José");
            nomes.add("Maria");
            nomes.add("Gustavo");
            nomes.add("Eduardo");
            System.out.println("===============================================");

            nomes.forEach((nome) -> {
                System.out.println(nome);
            });

            System.out.println("===============================================");
            // para remover todos os elementos de um ArrayList utilizar o método removeAll()
            nomes.removeAll(nomes);
            System.out.println(nomes.size() > 0 ? "Existem nomes" : "Não existem nomes");
            idades.removeAll(idades);
            // no HashSet também posso invovar o método removeAll() para remover todos os elementos
            System.out.println(idades.size() > 0 ? "Existem idades" : "Não existem idades");
            Pessoa pessoa1 = new Pessoa();
            Pessoa pessoa2 = new Pessoa();
            pessoa1.nome = "Eduardo";
            pessoa1.idade = 33;
            pessoa2.nome = "Fernanda";
            pessoa2.idade = 22;
            List<Pessoa> listaPessoas = new ArrayList<>();
            listaPessoas.add(pessoa1);
            listaPessoas.add(pessoa2);

            listaPessoas.forEach((p) -> {
                System.out.println("=================================");
                System.out.println(p.nome);
                System.out.println(p.idade);
                System.out.println("=================================");
            });

            /**
             * no método remove, caso eu possua uma lista de objetos,
             * caso eu tenha instanciado o objeto anteriormente a adição
             * do mesmo na lista, eu posso passar o objeto como parâmetro
             * para esse método e o objeto será removido da lista
             */
            listaPessoas.remove(pessoa1);

            listaPessoas.forEach((pessoa) -> {
                System.out.println(pessoa.nome);
                System.out.println(pessoa.idade);
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    private void testeMetodoFilter() {
        /**
         * o método filter serve para filtrar os items
         * da lista, ele cria uma lista contendo
         * os items filtrados por uma regra
         */
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Gabriel", 23));
        pessoas.add(new Pessoa("Pedro", 33));
        pessoas.add(new Pessoa("Fernanda", 21));
        pessoas.add(new Pessoa("Gustavo", 2));
        pessoas.add(new Pessoa("José", 34));
        List<Pessoa> pessoasDeMaior = pessoas.stream().filter(
                (pessoa) -> pessoa.idade >= 18
        ).collect(Collectors.toList());
        pessoasDeMaior.forEach((pessoa) -> {
            System.out.println("Pessoa de maior: " + pessoa.nome);
        });
    }

    private void testarMetodoMap() {
        List<Integer> idades = new ArrayList<>();
        idades.add(10);

        for (int i = 1; i < 10; i++) {
            idades.add(idades.get(i - 1) + 2);
        }

        idades.forEach((idade) -> {
            System.out.println("Idade de teste: " + idade);
        });
        List<Integer> idadesAlteradas = idades.stream().map(
                (idade) -> idade + 2
        ).collect(Collectors.toList());
        idadesAlteradas.forEach((idade) -> {
            System.out.println("Idade alterada: " + idade);
        });
        Set<String> nomes = new HashSet<>();
        nomes.add("Gabriel");
        nomes.add("Pedro");
        nomes.add("Eduardo");
        Set<String> nomesMaiusculos = nomes.stream().map(
                (nome) -> nome.toUpperCase()
        ).collect(Collectors.toSet());
        nomesMaiusculos.forEach(nomeMaiusculo -> System.out.println(nomeMaiusculo));
    }

    private void testeOrdenarLista() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Mário");
        nomes.add("Ana");
        nomes.add("José");
        nomes.add("Gabriel");
        System.out.println(nomes);
        /**
         * Para ordenar uma lista eu posso invocar o método sort da classe Collections,
         * no exemplo abaixo, a lista de strings será ordenada de forma alfabética
         * crescente
         */
        Collections.sort(nomes);
        System.out.println(nomes);
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Gabriel", 22));
        pessoas.add(new Pessoa("Pedro", 43));
        pessoas.add(new Pessoa("José", 21));
        pessoas.forEach((pessoa) -> {
            System.out.println(pessoa.nome);
            System.out.println(pessoa.idade);
        });
        /**
         * para ordenar uma lista de objetos, a classe
         * a qual o objeto é instanciado deve implementar
         * a interface Comparable
         */
        Collections.sort(pessoas);
        pessoas.forEach((pessoa) -> {
            System.out.println(pessoa.nome);
            System.out.println(pessoa.idade);
        });
    }

    @Override
    public void onClick(View view) {
        /**
         * Para implementar os tratamentos para o evento de clique,
         * eu posso fazer com que a minha activity implemente
         * a interface OnClickListener, quando ela implementa
         * essa interface, é obrigatório implementar o método onClick(),
         * nesse método eu trato os eventos de clique
         */
        int idElementoClicado = view.getId();

        if (idElementoClicado == R.id.btn_teste) {
            Log.i("TESTE", "Clicou no botão de teste!");
            txtTeste.setText("Botão clicado!");
            apresentarToast("Olá Mundo!");
            testeClassesInternas();
            testeClasseAnonima();
        }

    }
}